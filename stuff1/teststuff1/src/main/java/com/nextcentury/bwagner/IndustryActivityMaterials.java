package com.nextcentury.bwagner;

public class IndustryActivityMaterials {

	  private long typeID;
	
	private long activityID;
	
	private long materialTypeID;
	
	private long quantity;
	
	private int consume;

	public long getTypeID() {
		return typeID;
	}

	public void setTypeID(long typeID) {
		this.typeID = typeID;
	}

	public long getActivityID() {
		return activityID;
	}

	public void setActivityID(long activityID) {
		this.activityID = activityID;
	}

	public long getMaterialTypeID() {
		return materialTypeID;
	}

	public void setMaterialTypeID(long materialTypeID) {
		this.materialTypeID = materialTypeID;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public int getConsume() {
		return consume;
	}

	public void setConsume(int consume) {
		this.consume = consume;
	}
}
