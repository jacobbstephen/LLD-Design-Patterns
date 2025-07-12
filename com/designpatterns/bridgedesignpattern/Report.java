package com.designpatterns.bridgedesignpattern;

public class Report extends Document {

	public Report(Format format) {
		super(format);
		
	}

	@Override
	public void produce() {
		format.generate("Report");
		
	}

}



