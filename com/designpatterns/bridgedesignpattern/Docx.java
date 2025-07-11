package com.designpatterns.bridgedesignpattern;

public class Docx implements Format {

	@Override
	public void generate(String content) {
		 System.out.println("Generating DOCX: " + content);	
	}
	
}
