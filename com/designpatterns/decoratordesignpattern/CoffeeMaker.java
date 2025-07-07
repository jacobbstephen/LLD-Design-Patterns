package com.designpatterns.decoratordesignpattern;

public class CoffeeMaker {

	public static void main(String[] args) {
//		1. Make a simple Coffee
		Coffee coffee = new SimpleCoffee();
//		2. Add Milk to the coffee
		coffee = new MilkDecorator(coffee);
//		3. Add Sugar to Coffee
		coffee = new SugarDecorator(coffee);
		System.out.println(coffee.cost());
		System.out.println(coffee.description());

	}
}


