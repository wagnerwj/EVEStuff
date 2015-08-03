package com.nextcentury.bwagner;

import java.util.List;

//"totalCount_str": "23725", "pageCount": 24, "items": [
public class ItemPacket {
	
	private int totalCount_str;
	
	private int pageCount;
	
	private List<Item> items;

	public int getTotalCount_str() {
		return totalCount_str;
	}

	public void setTotalCount_str(int totalCount_str) {
		this.totalCount_str = totalCount_str;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
