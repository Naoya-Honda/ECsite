package com.internousdev.ecsite.dto;

public class ItemInfoDTO {

	private String itemName;
	private String itemPrice;
	private String itemStock;
	private String insert_date;

	public String getItemName(){
		return this.itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemPrice(){
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public String getItemStock(){
		return this.itemStock;
	}
	public void setItemStock(String itemStock){
		this.itemStock = itemStock;
	}

	public String getInsert_date(){
		return this.insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}

}
