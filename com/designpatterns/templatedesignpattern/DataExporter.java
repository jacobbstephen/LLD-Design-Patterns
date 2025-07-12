package com.designpatterns.templatedesignpattern;

public abstract class DataExporter {
	
	public  final void  export() {
		openFile();
		writeData();
		closeFile();
	}
	
	private void openFile() {
		System.out.println("OPENING FILE");
	}
	
	private final void closeFile() {
		System.out.println("CLOSING THE FILE");
	}
	
	protected abstract void writeData();

}

