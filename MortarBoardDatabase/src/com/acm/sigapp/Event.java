package com.acm.sigapp;

import com.google.appengine.api.images.*;

import java.util.Date;

public class Event {

	String name;
	Date date;
	String description;
	String location;
	Image picture;
	
	/*
	 * Creates an event object.
	 * 
	 * @param n The name of the event.
	 * @param da The date and time that the event occurs.
	 * @param de A description of the event.
	 * @param l A text description of the location.
	 * @param p A picture of the event.
	 * 
	 */
	public Event (String n, Date da, String de, String l, Image p) {
		name = n;
		date = da;
		description = de;
		location = l;
		picture = p;
	}
	
	/*
	 * Creates an event object.
	 * 
	 * @param n The name of the event.
	 * @param da The date and time that the event occurs.
	 * @param de A description of the event.
	 * @param l A text description of the location.
	 */
	public Event (String n, Date da, String de, String l) {
		name = n;
		date = da;
		description = de;
		location = l;
		
	}
	
}
