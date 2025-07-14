package com.designpatterns.statedesignpattern;

public class AvailableState implements State {

	@Override
	public void assignRide(Driver driver) {
		System.out.println("Assigning Ride");
		driver.setState(new AssignedState());
		
	}

	@Override
	public void completeRide(Driver driver) {
		System.out.println("Cannot Complete Ride");
		
	}

}

