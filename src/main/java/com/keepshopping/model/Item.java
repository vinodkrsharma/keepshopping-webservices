package com.keepshopping.model;

public class Item{
    
    private String itemName;
    private long quantity;
    private long quantityLeft;
    private double price;
    private String itemId;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getQuantityLeft() {
		return quantityLeft;
	}
	public void setQuantityLeft(long quantityLeft) {
		this.quantityLeft = quantityLeft;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
    
    
}