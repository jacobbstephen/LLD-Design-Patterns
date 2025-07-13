package com.designpatterns.statedesignpattern;

public class AssignedState implements State {

	@Override
	public void assignRide(Driver driver) {
		System.out.println("Cannot Assign  Ride");
		
	}

	@Override
	public void completeRide(Driver driver) {
		System.out.println("Completing Ride");
		driver.setState(new AvailableState());
		
	}

}
