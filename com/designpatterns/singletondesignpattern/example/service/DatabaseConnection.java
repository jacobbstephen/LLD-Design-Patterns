package com.designpatterns.singletondesignpattern.example.service;

public class DatabaseConnection {
	private static DatabaseConnection instance;
	
	private DatabaseConnection() {
		System.out.println("Conection  Created");
	}
	public static DatabaseConnection getInstance() {
		if(instance == null) instance = new DatabaseConnection();
		return instance;
	}
	public void makeConnection() {
		System.out.println("Connection Established with the Database");
	}
}
