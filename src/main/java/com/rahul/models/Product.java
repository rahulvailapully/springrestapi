package com.rahul.models;

public class Product {
	
	private String id;
	private String desc;
	private double price;
	private String seller;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product(String id, String desc, double price, String seller, String name) {
		super();
		this.id = id;
		this.desc = desc;
		this.price = price;
		this.seller = seller;
		this.name = name;
	}
	
	

}
