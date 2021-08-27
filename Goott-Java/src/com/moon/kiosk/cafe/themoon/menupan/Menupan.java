package com.moon.kiosk.cafe.themoon.menupan;

import java.util.ArrayList;

import com.moon.kiosk.cafe.themoon.product.Dessert;
import com.moon.kiosk.cafe.themoon.product.Drink;
import com.moon.kiosk.cafe.themoon.product.Product;

public class Menupan {
	public ArrayList<Product> products;
	public ArrayList<Integer> orderCounts;
	public void init() {
		products = new ArrayList<Product>();
		
		products.add(new Drink("아이스아메리카노", 3900));
		products.add(new Drink("핫아메리카노", 3900));
		products.add(new Dessert("와플", 2900));
		products.add(new Dessert("마카롱", 4500));
		
		orderCounts = new ArrayList<Integer>();
		initOrder();
	}
	
	public void initOrder() {
		orderCounts.clear();
		for(int i = 0; i < products.size(); i++) {
			orderCounts.add(0);
		}
	}
	
	public void write(int menuNumber, int menuCount) {
		orderCounts.set(menuNumber - 1, menuCount);
	}
	
	public int calculteTotalpayment() {
		int sum = 0;
		for(int i = 0; i < orderCounts.size(); i++) {
			sum = sum + products.get(i).price * orderCounts.get(i);
		}
		return sum;
	}
}
