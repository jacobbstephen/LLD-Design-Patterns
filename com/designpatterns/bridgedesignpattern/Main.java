package com.designpatterns.bridgedesignpattern;

public class Main {

	public static void main(String[] args) {
		Format pdfFormat = new Pdf();
		Format docsFormat = new Docx();
		Report report = new Report(docsFormat);
		Certificate certificate = new  Certificate(pdfFormat);
		report.produce();
		certificate.produce();
	}

}
