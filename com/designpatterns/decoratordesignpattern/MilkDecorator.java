package com.designpatterns.decoratordesignpattern;

public class MilkDecorator extends CoffeeDecorator {

	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public double cost() {
		return super.cost() + 1;
 	}
	@Override
	public String description() {
		return super.description() + " with Milk";
	}

}

