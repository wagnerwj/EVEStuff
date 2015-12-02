package com.nextcentury.bwagner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathFactory;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;


public class EveApiHelper {
	
	private static String BP_REST_CALL =  "/Char/Blueprints.xml.aspx";
	
	private static String ASSET_REST_CALL = "/Char/AssetList.xml.aspx";
	
	private static String EVE_BASE_URL = "https://api.eveonline.com";
	
	private HttpClient client =  HttpClients.createDefault();
	
	private DocumentBuilderFactory factory;
	private DocumentBuilder builder;
	private XPath helperXPath;
	
	public EveApiHelper() {
		 try {
			factory = DocumentBuilderFactory.newInstance();
			 builder = factory.newDocumentBuilder();
	
			helperXPath = XPathFactory.newInstance().newXPath();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public HttpResponse getRestResponse( HttpUriRequest request) throws  IOException{
		return client.execute(request);
	}

	
	public List<CharacterAsset> getCharacterAssets(String keyAuth){
		List<CharacterAsset> assetList = new ArrayList<CharacterAsset>();
		HttpGet getUriRequest = new HttpGet(EVE_BASE_URL+ASSET_REST_CALL+"?"+keyAuth);
		String assets = runDaGuts(getUriRequest);
		Document assetDocument = getDocumentFromString(assets);
		try {
			NodeList nodes = (NodeList)helperXPath.compile("/eveapi/result/rowset/row").evaluate(assetDocument, XPathConstants.NODESET);
			for(int index=0; index < nodes.getLength();index++){
				Node node = nodes.item(index);
				CharacterAsset asset = new CharacterAsset(node.getAttributes());
				assetList.add(asset);
			}
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return assetList;
	}
	
	
	public List<CharacterBlueprint> getCharacterBluePrints(String keyAuth){
		List<CharacterBlueprint> bluePrints = new ArrayList<CharacterBlueprint>();
		HttpGet getUriRequest = new HttpGet(EVE_BASE_URL+BP_REST_CALL+"?"+keyAuth);
		String bps =  runDaGuts(getUriRequest);
		Document bpDocument = getDocumentFromString(bps);

		NodeList nodes =bpDocument.getElementsByTagName("row");
		for(int index=0; index < nodes.getLength();index++){
			Node node = nodes.item(index);
			CharacterBlueprint bp = new CharacterBlueprint(node.getAttributes());
			bluePrints.add(bp);
		}
		return bluePrints;
	}
	private String runDaGuts(HttpUriRequest request){
		StringBuffer buffer = new StringBuffer();
		try{
			 HttpEntity entity1 = getRestResponse(request).getEntity();
			   ObjectMapper jsonMapper = new  ObjectMapper(); 
			 //  Item item = jsonMapper.readValue(entity1.getContent(), Item.class);
			    BufferedReader reader = new BufferedReader(new InputStreamReader(entity1.getContent()) );
			    String s= null;
			   while((s=reader.readLine())!=null){
			    	buffer.append(s);
			    }
			    int rhe=3;
			    // do something useful with the response body
			    // and ensure it is fully consumed
			    EntityUtils.consume(entity1);
		} catch(IOException e){
			System.out.println(e.getLocalizedMessage());
		} 
		return buffer.toString();
	}
	
	
	private Document getDocumentFromString(String xmlFormat){
		Document document = null;

			InputSource inputSource = new InputSource(new StringReader(xmlFormat));
			try {
				document = builder.parse(inputSource);
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		return document;
	}
}
