package com.nextcentury.bwagner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nextcentury.bwagner.dao.InvTypesDao;


public class EveClientHelper {

	public static void main(String[] args) {
	//	CloseableHttpClient httpclient = HttpClients.createDefault();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml");
		String keyAuth ="keyID=3187579&vCode=nszMsNW0JcPRK2U9c5NCss6g4UBWfukJdbgCYsNolIxgX23IOuywBaigfOjI2q4j";
		EveApiHelper helper = new EveApiHelper();
		
		 helper.getCharacterBluePrints(keyAuth);
		//helper.getCharacterAssets(keyAuth);
		InvTypesDao invTypesDao = context.getBean(InvTypesDao.class);
		InvTypes type = invTypesDao.findOne(3083l);
	 
		
		int rhe=3;
//		String assets = "/Char/AssetList.xml.aspx";
//		String bps = "/Char/Blueprints.xml.aspx";
//		HttpGet httpGet = new HttpGet("https://api.eveonline.com"+bps+keyAuth);//"https://public-crest.eveonline.com/types/2200/");
//		try {
//			CloseableHttpResponse response1 = httpclient.execute(httpGet);
//			 System.out.println(response1.getStatusLine());
//			    HttpEntity entity1 = response1.getEntity();
//			   ObjectMapper jsonMapper = new  ObjectMapper(); 
//			 //  Item item = jsonMapper.readValue(entity1.getContent(), Item.class);
//			    BufferedReader reader = new BufferedReader(new InputStreamReader(entity1.getContent()) );
//			    String s= null;
//			   while((s=reader.readLine())!=null){
//			    	System.out.println(s);
//			    }
//			    int rhe=3;
//			    // do something useful with the response body
//			    // and ensure it is fully consumed
//			    EntityUtils.consume(entity1);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
