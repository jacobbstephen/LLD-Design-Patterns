package com.designpatterns.decoratordesignpattern;

public abstract class CoffeeDecorator  implements Coffee{
	protected Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee =  coffee;
	}
	public double cost() {
		return decoratedCoffee.cost();
	}
	public String description() {
		return decoratedCoffee.description();
	}
	
}



