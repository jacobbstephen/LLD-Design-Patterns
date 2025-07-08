package com.designpatterns.facadedesignpattern.services;

public class InventoryService {
	public void checkStock(String itemId) {
		System.out.println("Checking the stock of the product: " + itemId);
	}
}
