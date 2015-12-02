package com.nextcentury.bwagner;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
public class InvTypes {
//
	  
	  @Id
	  @Column(name = "typeID")
	  private long typeID;
	  
	  private long groupID;
	  
	  private String typeName;
	  
	  private String description;
	  
	  private Double mass;
	  
	  private Double volume;
	  
	  private Double capacity;
	  
	  private Long portionSize;
	  
	  private Short raceID;
	  
	  private BigDecimal basePrice;
	  
	  private Boolean published;
	  
	  private Long marketGroupID;
	  

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

	public Short getRaceID() {
		return raceID;
	}

	public void setRaceID(Short raceID) {
		this.raceID = raceID;
	}

	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public Long getMarketGroupID() {
		return marketGroupID;
	}

	public void setMarketGroupID(Long marketGroupID) {
		this.marketGroupID = marketGroupID;
	}

}
