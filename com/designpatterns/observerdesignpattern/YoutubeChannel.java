package com.designpatterns.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel {
	List<Subscriber> list = new ArrayList<>();
	
	@Override
	public void subscribe(Subscriber subscriber) {
		list.add(subscriber);
		
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		list.remove(subscriber);
		
	}

	@Override
	public void notifySubscribers(String videoTitle) {
		for(Subscriber sub: list) {
			sub.update(videoTitle);
		}
		
	}
	
	public void uploadNewVideo(String videoTitle) {
		System.out.println("New Video: " + videoTitle + " is uploaded in youtube");
		notifySubscribers(videoTitle);
	}

}
