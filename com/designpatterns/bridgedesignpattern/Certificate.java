package com.designpatterns.bridgedesignpattern;

public class Certificate extends Document {

	public Certificate(Format format) {
		super(format);
	}

	@Override
	public void produce() {
		format.generate("Certificate");
		
	}
}


