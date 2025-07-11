package com.designpatterns.bridgedesignpattern;

public abstract class Document {
	protected Format format;
	public Document(Format format) {
		this.format = format;
	}
	public abstract void produce();
}
