package com.nextcentury.bwagner;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		String patternString = "([\\d\\D]+?)( x([\\d]+))?";
		String rejectionString="\\[empty.*";
		Pattern pattern = Pattern.compile(patternString);
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
		for(int indx=1;indx <lines.length;indx++){
			if(!Pattern.matches(rejectionString, lines[indx])){
				
				
				
				
				Matcher m = pattern.matcher(lines[indx]);
				if(m.matches()){
					String itemNameGroup = m.group(1);
					if(itemNameGroup.contains(",")){
						String[] itemNames = itemNameGroup.split(",");
						
					}
					if(m.group(3)!=null){
						
					}
				}
				System.out.println(m.matches()+" "+m.group(1)+" "+m.group(3));
			}
		}
		int rhe = 0;
	}
	
	
	public static void main(String[] args){
		String EFTString= "[Svipul, Bastion/LAWN]\n"+
				"Pseudoelectron Containment Field I\n"+
				"Gyrostabilizer II\n"+
				"Micro Auxiliary Power Core II\n"+
				"Nanofiber Internal Structure II\n"+

				"Warp Disruptor II\n"+
				"5MN Quad LiF Restrained Microwarpdrive\n"+
				"Medium Azeotropic Restrained Shield Extender\n"+
				"Adaptive Invulnerability Field II\n"+

				"280mm Howitzer Artillery II, Republic Fleet EMP S\n"+
				"280mm Howitzer Artillery II, Republic Fleet EMP S\n"+
				"280mm Howitzer Artillery II, Republic Fleet EMP S\n"+
				"280mm Howitzer Artillery II, Republic Fleet EMP S\n"+
				"[empty high slot]\n"+
				"[empty high slot]\n"+

				"Small Core Defense Field Extender I\n"+
				"Small Core Defense Field Extender I\n"+
				"Small Core Defense Field Extender I\n"+

				"Republic Fleet EMP S x720\n"+
				"Republic Fleet Phased Plasma S x720\n"+
				"Republic Fleet Fusion S x720\n"+
				"Republic Fleet Depleted Uranium S x720\n"+
				"Quake S x720\n"+
				"Tremor S x720\n"+
				"Bouncer II x3";
		EFTFormatParser parser = new EFTFormatParser();
		parser.parseEFT(EFTString);
	}
}
