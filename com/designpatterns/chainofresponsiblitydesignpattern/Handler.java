package com.designpatterns.chainofresponsiblitydesignpattern;

public abstract class Handler {
	protected Handler nextHandler;
	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	public abstract void handle(Request request);
}
