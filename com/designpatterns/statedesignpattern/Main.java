package com.designpatterns.statedesignpattern;

public class Main {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.assignRide();// Assign Ride
		driver.assignRide();// Cannot Assign Ride
		driver.completeRide();// Complete Ride
		driver.completeRide();// Cannot Complete Ride

	}

}
