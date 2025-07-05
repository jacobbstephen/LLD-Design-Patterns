package com.designpatterns.singletondesignpattern.example.controller;

import com.designpatterns.singletondesignpattern.example.service.DatabaseConnection;

public class Main {
	public static void main(String[] args) {
		// Get the singleton instance
		DatabaseConnection conn1 = DatabaseConnection.getInstance();
		DatabaseConnection conn2 = DatabaseConnection.getInstance();
		
		// Confirm both variables point to the same object
		System.out.println(conn1 == conn2);
		
		conn1.makeConnection();
		conn2.makeConnection();
		
		
		
	}
}	

