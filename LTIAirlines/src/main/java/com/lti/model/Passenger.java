package com.lti.model;

public class Passenger {
	
	int PID;
	String name;
	public Passenger(int pID, String name) {
		super();
		PID = pID;
		this.name = name;
	}
	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
