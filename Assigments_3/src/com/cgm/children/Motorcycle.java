package com.cgm.children;

import com.cgm.interfaces.Ground;
import com.cgm.parent.Vehicle;

public class Motorcycle extends Vehicle implements Ground{

	private String handlebars;
	private boolean attache;
	
	public String getHandlebars() {
		return handlebars;
	}
	public void setHandlebars(String handlebars) {
		this.handlebars = handlebars;
	}
	public boolean isAttache() {
		return attache;
	}
	public void setAttache(boolean attache) {
		this.attache = attache;
	}
	@Override
	public void acceleration() {
		System.out.println("Acceleration for a motorcycle!");
		
	}
	@Override
	public void braking() {
		System.out.println("Braking for a motorcycle");
		
	}
	@Override
	public void parking() {
		System.out.println("Parking for a motorcycle");
		
	}
	@Override
	public void towing() {
		System.out.println("Towing motorcycle");
		
	}
	
	@Override
	public void TurnEngineOn() {
		System.out.println("Engine on for motorcycle!");
	}
	
	@Override
	public void TurnEngineOff() {
		System.out.println("Engine off for motorcycle!");
	}
	
	@Override
	public void Turning() {
		System.out.println("Specific type of turning for motorcycle");
	}
	
	@Override
	public String toString() {
		return "Motorcycle [handlebars=" + handlebars + ", attache=" + attache + ", getNumberOfSeats()="
				+ getNumberOfSeats() + ", getEngineTime()=" + getEngineTime() + ", getHorsePowerDriving()="
				+ getHorsePowerDriving() + ", getNumberOfDoors()=" + getNumberOfDoors() + ", getMaterial()="
				+ getMaterial() + ", getCategory()=" + getCategory() + ", getTypeOfFeul()=" + getTypeOfFeul()
				+ ", getSpeed()=" + getSpeed() + ", getYearOfFabrication()=" + getYearOfFabrication()
				+ ", getColorType()=" + getColorType() + "]";
	}
	
	
}
