package com.cgm.children;

import com.cgm.parent.Vehicle;
import com.cgm.interfaces.Ground;

public class Car extends Vehicle implements Ground {
	
	String TypeOfSeatBelts ;
	String TypeOfAirBags ;
	boolean AutomaticTransmission;
	
	public String getTypeOfSeatBelts() {
		return TypeOfSeatBelts;
	}
	public void setTypeOfSeatBelts(String typeOfSeatBelts) {
		TypeOfSeatBelts = typeOfSeatBelts;
	}
	public String getTypeOfAirBags() {
		return TypeOfAirBags;
	}
	public void setTypeOfAirBags(String typeOfAirBags) {
		TypeOfAirBags = typeOfAirBags;
	}
	public boolean isAutomaticTransmission() {
		return AutomaticTransmission;
	}
	public void setAutomaticTransmission(boolean automaticTransmission) {
		AutomaticTransmission = automaticTransmission;
	}
	@Override
	public void acceleration() {
		System.out.println("Acceleration for a car ");
		
	}
	@Override
	public void braking() {
		System.out.println("Braking for a car ");
		
	}
	@Override
	public void parking() {
		System.out.println("Parking for a car");
		
	}
	@Override
	public void towing() {
		System.out.println("A car can tow a other vehicle, or he can be towing");
		
	}
	
	@Override
	public String toString() {
		return "Car [TypeOfSeatBelts=" + TypeOfSeatBelts + ", TypeOfAirBags=" + TypeOfAirBags
				+ ", AutomaticTransmission=" + AutomaticTransmission + ", getNumberOfSeats()=" + getNumberOfSeats()
				+ ", getEngineTime()=" + getEngineTime() + ", getHorsePowerDriving()=" + getHorsePowerDriving()
				+ ", getNumberOfDoors()=" + getNumberOfDoors() + ", getMaterial()=" + getMaterial() + ", getCategory()="
				+ getCategory() + ", getTypeOfFeul()=" + getTypeOfFeul() + ", getSpeed()=" + getSpeed()
				+ ", getYearOfFabrication()=" + getYearOfFabrication() + ", getColorType()=" + getColorType() + "]";
	}
	@Override
	public void TurnEngineOn() {
		System.out.println("Engine on for car!");
	}
	
	@Override
	public void TurnEngineOff() {
		System.out.println("Engine off for car !");
	}
	
	@Override
	public void Turning() {
		System.out.println("Specific type of turning for car");
	}
	
	
}
