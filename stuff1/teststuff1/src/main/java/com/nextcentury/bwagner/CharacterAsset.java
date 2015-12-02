package com.nextcentury.bwagner;

import org.w3c.dom.NamedNodeMap;


public class CharacterAsset {
	private Long itemID;
	
	private Long locationID;
	
	private Integer typeID;
	
	private Integer quantity;

	
	public CharacterAsset(){
		
	}
	
	public CharacterAsset(NamedNodeMap attributeMap){
		this.itemID =Long.parseLong( attributeMap.getNamedItem("itemID").getNodeValue());
		this.locationID = Long.parseLong(attributeMap.getNamedItem("locationID").getNodeValue());
		this.typeID = Integer.parseInt(attributeMap.getNamedItem("typeID").getNodeValue());
		this.quantity = Integer.parseInt(attributeMap.getNamedItem("quantity").getNodeValue());
	}
	
	public Long getItemID() {
		return itemID;
	}

	public void setItemID(Long itemID) {
		this.itemID = itemID;
	}

	public Long getLocationID() {
		return locationID;
	}

	public void setLocationID(Long locationID) {
		this.locationID = locationID;
	}

	public Integer getTypeID() {
		return typeID;
	}

	public void setTypeID(Integer typeID) {
		this.typeID = typeID;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

}
