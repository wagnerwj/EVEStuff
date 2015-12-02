package com.nextcentury.bwagner;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.w3c.dom.NamedNodeMap;

@Entity
public class CharacterBlueprint {
	@Id
	private Long itemID;
	
	private Long locationID;
	
	private Integer typeID;
	
	private String typeName;
	
	private Boolean flagID;
	
	private Integer quantity;
	
	private Integer timeEfficiency;
	
	private Integer materialEfficiency;
	
	private Integer runs;

	public CharacterBlueprint(){
		
	}
	
	public CharacterBlueprint(NamedNodeMap attributeMap){
		this.itemID =Long.parseLong( attributeMap.getNamedItem("itemID").getNodeValue());
		this.locationID = Long.parseLong(attributeMap.getNamedItem("locationID").getNodeValue());
		this.typeID = Integer.parseInt(attributeMap.getNamedItem("typeID").getNodeValue());
		this.typeName=attributeMap.getNamedItem("typeName").getNodeValue();
		this.quantity = Integer.parseInt(attributeMap.getNamedItem("quantity").getNodeValue());
		this.timeEfficiency =  Integer.parseInt(attributeMap.getNamedItem("timeEfficiency").getNodeValue());
		this.materialEfficiency =  Integer.parseInt(attributeMap.getNamedItem("materialEfficiency").getNodeValue());
		this.runs =  Integer.parseInt(attributeMap.getNamedItem("runs").getNodeValue());
		
		this.flagID=true;
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

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Boolean getFlagID() {
		return flagID;
	}

	public void setFlagID(Boolean flagID) {
		this.flagID = flagID;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getTimeEfficiency() {
		return timeEfficiency;
	}

	public void setTimeEfficiency(Integer timeEfficiency) {
		this.timeEfficiency = timeEfficiency;
	}

	public Integer getMaterialEfficiency() {
		return materialEfficiency;
	}

	public void setMaterialEfficiency(Integer materialEfficiency) {
		this.materialEfficiency = materialEfficiency;
	}

	public Integer getRuns() {
		return runs;
	}

	public void setRuns(Integer runs) {
		this.runs = runs;
	}
	

}
