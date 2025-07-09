package com.designpatterns.proxydesignpattern;

public class RealImage implements ImageInterface {
	private String filename;
	

	public RealImage(String filename) {
		super();
		this.filename = filename;
		loadFromDisk();
	}
	
	public void loadFromDisk() {
		System.out.println("Loading " + filename + " from the disk");
	}


	@Override
	public void display() {
		System.out.println("Displaying the image: " + filename );
		
	}

}

