package com.designpatterns.proxydesignpattern;

public class ProxyImage implements ImageInterface{
	private RealImage realImage;
	private String fileName;
	

	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}


	@Override
	public void display() {
		if(realImage == null) realImage = new RealImage(fileName);
		realImage.display();
		
	}

}



