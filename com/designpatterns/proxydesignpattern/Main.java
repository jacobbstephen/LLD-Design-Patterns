package com.designpatterns.proxydesignpattern;

public class Main {
	public static void main(String[] args) {
		ImageInterface proxyImage = new ProxyImage("photo.jpg");
		proxyImage.display();
		
		
	}
}
