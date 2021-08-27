package com.moon.kiosk.cafe.themoon.product;

public abstract class Product {
	public String name;
	public int price;
	public Product (String name, int price){
		this.name = name;
		this.price = price;
	}
}
