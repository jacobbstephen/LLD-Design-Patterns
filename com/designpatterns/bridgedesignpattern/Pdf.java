package com.designpatterns.bridgedesignpattern;

public class Pdf implements Format {
	@Override
	public void generate(String content) {
		 System.out.println("Generating PDF: " + content);	
	}
}
