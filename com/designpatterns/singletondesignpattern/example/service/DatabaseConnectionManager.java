package com.designpatterns.singletondesignpattern.example.service;

public class DatabaseConnectionManager {
	private static DatabaseConnectionManager instance;
	
	private DatabaseConnectionManager() {
		System.out.println("Collection pool Created");
	}
	public static DatabaseConnectionManager getInstance() {
		if(instance == null) instance = new DatabaseConnectionManager();
		return instance;
	}
	public void getConnection() {
		System.out.println("Connection Established with the Database");
	}
}
