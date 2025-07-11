package com.designpatterns.observerdesignpattern;

public class Main {

	public static void main(String[] args) {
		YoutubeChannel youtube = new YoutubeChannel();
		Subscriber a = new EmailSubscriber();
		youtube.subscribe(a);
		Subscriber b = new MobileSubscriber();
		youtube.subscribe(b);
		
		youtube.uploadNewVideo("Observer Design Pattern");
	}
}




