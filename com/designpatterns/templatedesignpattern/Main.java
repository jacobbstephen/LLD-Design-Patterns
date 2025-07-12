package com.designpatterns.templatedesignpattern;

public class Main {
	public static void main(String[] args) {
		System.out.println("<-XML->");
		DataExporter xml = new XMLExporter();
		xml.export();
		System.out.println("<-CSV->");
		DataExporter  csv = new CSVExporter();
		csv.export();
	}
}

