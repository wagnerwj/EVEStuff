package com.nextcentury.bwagner;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EFTFormatParser {

	
	private static String[] SLOT_TYPES={"high","medium","low","rig","subsytem"};
	
	private static Map<String,String> SLOT_SHORT_NAME_MAP;
	static{
			Map<String, String> aMap=new HashMap<String, String>();
			aMap.put("high", "hi");
			aMap.put("medium", "med");
			aMap.put("low", "low");
			aMap.put("rig", "rig");
			aMap.put("subsystem", "subsystem");
			SLOT_SHORT_NAME_MAP = Collections.unmodifiableMap(aMap);
	}
	
	
	public void parseEFT(String eftFormatFit){
		eftFormatFit.trim();
		
		String[] lines= eftFormatFit.split("[\n\r]+");
		String ship = null;
		String name = null; 
		//Get name:
		int firstComma = lines[0].indexOf(',');
		if(firstComma > 0){
			ship = lines[0].substring(1, firstComma);
			name= lines[0].substring(firstComma+1, lines[0].length()-2);
		}
		int rhe = 0;
	}
	
	
	public static void main(String[] args){
		String EFTString= "[Svipul, Bastion/LAWN]\n"+
"Pseudoelectron Containment Field I\n"+
"Gyrostabilizer II\n"+
"Micro Auxiliary Power Core II\n"+
"Nanofiber Internal Structure II";
		EFTFormatParser parser = new EFTFormatParser();
		parser.parseEFT(EFTString);
	}
}
