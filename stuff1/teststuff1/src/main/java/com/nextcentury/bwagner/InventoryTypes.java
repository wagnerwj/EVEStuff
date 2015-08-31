package com.nextcentury.bwagner;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class InventoryTypes {
//
	  
	  @Id
	  private long typeID;
	  
	  private long groupID;
	  
	  private String typeName;
	  
	  private String description;
	  
	  private double mass;
	  
	  private double volume;
	  
	  private double capacity;
	  
	  private long portionSize;
	  
	  private int raceID;
	  
	  private double basePrice;
	  
	  private boolean published;
	  
	  private long marketGroupID;
	  
	  private double chanceOfDuplicating;

	public long getTypeID() {
		return typeID;
	}

	public void setTypeID(long typeID) {
		this.typeID = typeID;
	}

	public long getGroupID() {
		return groupID;
	}

	public void setGroupID(long groupID) {
		this.groupID = groupID;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public long getPortionSize() {
		return portionSize;
	}

	public void setPortionSize(long portionSize) {
		this.portionSize = portionSize;
	}

	public int getRaceID() {
		return raceID;
	}

	public void setRaceID(int raceID) {
		this.raceID = raceID;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public long getMarketGroupID() {
		return marketGroupID;
	}

	public void setMarketGroupID(long marketGroupID) {
		this.marketGroupID = marketGroupID;
	}

	public double getChanceOfDuplicating() {
		return chanceOfDuplicating;
	}

	public void setChanceOfDuplicating(double chanceOfDuplicating) {
		this.chanceOfDuplicating = chanceOfDuplicating;
	}
}
