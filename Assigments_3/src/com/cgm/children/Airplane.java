package com.cgm.children;

import com.cgm.parent.Vehicle;
import com.cgm.interfaces.Air;

public class Airplane extends Vehicle implements Air {

	private String WingArea;
	private String TypeOfAirplane;

	public String getTypeOfAirplane() {
		return TypeOfAirplane;
	}

	public void setTypeOfAirplane(String typeOfAirplane) {
		TypeOfAirplane = typeOfAirplane;
	}

	@Override
	public String toString() {
		return "Airplane [WingArea=" + WingArea + ", TypeOfAirplane=" + TypeOfAirplane + ", getNumberOfSeats()="
				+ getNumberOfSeats() + ", getEngineTime()=" + getEngineTime() + ", getHorsePowerDriving()="
				+ getHorsePowerDriving() + ", getNumberOfDoors()=" + getNumberOfDoors() + ", getMaterial()="
				+ getMaterial() + ", getCategory()=" + getCategory() + ", getTypeOfFeul()=" + getTypeOfFeul()
				+ ", getSpeed()=" + getSpeed() + ", getYearOfFabrication()=" + getYearOfFabrication()
				+ ", getColorType()=" + getColorType() + "]";
	}

	@Override
	public void TakeOff() {
		System.out.println("The airplane can take off to fly");
		
	}

	@Override
	public void Landing() {
		System.out.println("Landing the airplane");
		
	}
	
	@Override
	public void MaxHeight() {
		System.out.println("Max Height for this type of airplane");
		
	}

	public String getWingArea() {
		return WingArea;
	}

	public void setWingArea(String wingArea) {
		WingArea = wingArea;
	}
	
	@Override
	public void TurnEngineOn() {
		System.out.println("Engine on for airplane !");
	}
	
	@Override
	public void TurnEngineOff() {
		System.out.println("Engine off for airplane!");
	}
	
	@Override
	public void Turning() {
		System.out.println("Specific type of turning for airplane on handle");
	}


}
