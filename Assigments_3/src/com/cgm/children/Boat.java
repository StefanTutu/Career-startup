package com.cgm.children;

import com.cgm.parent.Vehicle;
import com.cgm.interfaces.Water;

public class Boat extends Vehicle implements Water{

	private String typeOfDeck;
	private String TypeOfHelm;
	
	public String getTypeOfDeck() {
		return typeOfDeck;
	}
	public void setTypeOfDeck(String typeOfDeck) {
		this.typeOfDeck = typeOfDeck;
	}
	public String getTypeOfHelm() {
		return TypeOfHelm;
	}
	public void setTypeOfHelm(String typeOfHelm) {
		TypeOfHelm = typeOfHelm;
	}
	@Override
	public void Floating() {
		System.out.println("The boat have a floating zone ");
		
	}
	@Override
	public String toString() {
		return "Boat [typeOfDeck=" + typeOfDeck + ", TypeOfHelm=" + TypeOfHelm + ", getNumberOfSeats()="
				+ getNumberOfSeats() + ", getEngineTime()=" + getEngineTime() + ", getHorsePowerDriving()="
				+ getHorsePowerDriving() + ", getNumberOfDoors()=" + getNumberOfDoors() + ", getMaterial()="
				+ getMaterial() + ", getCategory()=" + getCategory() + ", getTypeOfFeul()=" + getTypeOfFeul()
				+ ", getSpeed()=" + getSpeed() + ", getYearOfFabrication()=" + getYearOfFabrication()
				+ ", getColorType()=" + getColorType() + "]";
	}
	@Override
	public boolean Rowing() {
		System.out.println("The boat can be a rowing or not !");
		return false;
	}
	
	@Override
	public void TurnEngineOn() {
		System.out.println("Engine on for boat!");
	}
	
	@Override
	public void TurnEngineOff() {
		System.out.println("Engine off for boat!");
	}
	
	@Override
	public void Turning() {
		System.out.println("Specific type of turning for boat, based on helm type ");
	}
	
}
