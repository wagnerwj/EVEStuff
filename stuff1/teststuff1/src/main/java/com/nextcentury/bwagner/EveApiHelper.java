package com.nextcentury.bwagner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EveApiHelper {
	
	private static String BP_REST_CALL =  "/Char/Blueprints.xml.aspx";
	
	private static String ASSET_REST_CALL = "/Char/AssetList.xml.aspx";
	
	private static String EVE_BASE_URL = "https://api.eveonline.com";
	
	private HttpClient client =  HttpClients.createDefault();
	
	public HttpResponse getRestResponse( HttpUriRequest request) throws  IOException{
		return client.execute(request);
	}

	
	public void getCharacterAssets(String keyAuth){
		HttpGet getUriRequest = new HttpGet(EVE_BASE_URL+ASSET_REST_CALL+"?"+keyAuth);
		runDaGuts(getUriRequest);
	}
	
	
	public void getCharacterBluePrints(String keyAuth){
		HttpGet getUriRequest = new HttpGet(EVE_BASE_URL+BP_REST_CALL+"?"+keyAuth);
		runDaGuts(getUriRequest);
	}
	private void runDaGuts(HttpUriRequest request){
		try{
			 HttpEntity entity1 = getRestResponse(request).getEntity();
			   ObjectMapper jsonMapper = new  ObjectMapper(); 
			 //  Item item = jsonMapper.readValue(entity1.getContent(), Item.class);
			    BufferedReader reader = new BufferedReader(new InputStreamReader(entity1.getContent()) );
			    String s= null;
			   while((s=reader.readLine())!=null){
			    	System.out.println(s);
			    }
			    int rhe=3;
			    // do something useful with the response body
			    // and ensure it is fully consumed
			    EntityUtils.consume(entity1);
		} catch(IOException e){
			System.out.println(e.getLocalizedMessage());
		} 
	}
}
