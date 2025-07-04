package com.designpatterns.singletondesignpattern.example.controller;

import com.designpatterns.singletondesignpattern.example.service.DatabaseConnectionManager;

public class Main {
	public static void main(String[] args) {
		// Get the singleton instance
		DatabaseConnectionManager manager1 = DatabaseConnectionManager.getInstance();
		DatabaseConnectionManager manager2 = DatabaseConnectionManager.getInstance();
		
		// Confirm both variables point to the same object
		System.out.println(manager1 == manager2);
		
		manager1.getConnection();
		manager2.getConnection();
		
		
		
	}
}	
