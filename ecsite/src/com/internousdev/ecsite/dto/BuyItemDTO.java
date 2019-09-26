package com.internousdev.ecsite.dto;

public class BuyItemDTO {

	private int id;
	private String itemName;
	private String itemPrice;
	private int itemStock;


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
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getItemStock() {
		return this.itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
}
