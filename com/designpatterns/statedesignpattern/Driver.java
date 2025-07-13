package com.designpatterns.statedesignpattern;

public class Driver {
	private State currentState;
	public Driver() {
		currentState = new AvailableState();
	}
	public void setState(State state) {
		currentState = state;
	}
	public void completeRide() {
		currentState.completeRide(this);
	}
	public void assignRide() {
		currentState.assignRide(this);
	}
}
