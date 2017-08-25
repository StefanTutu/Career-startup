package com.cgm.parent;

public abstract class Vehicle {

	private int speed;
	private int yearOfFabrication;
	private String ColorType;
	private String TypeOfFuel;
	private String Category;
	private int NumberOfSeats;
	private int EngineTime;
	private int HorsePowerDriving;
	private int NumberOfDoors;
	private String Material;
	
	public Integer getNumberOfSeats() {
		return NumberOfSeats;
	}
	public void setNumberOfSeats(Integer numberOfSeats) {
		NumberOfSeats = numberOfSeats;
	}
	public Integer getEngineTime() {
		return EngineTime;
	}
	public void setEngineTime(Integer engineTime) {
		EngineTime = engineTime;
	}
	public int getHorsePowerDriving() {
		return HorsePowerDriving;
	}
	public void setHorsePowerDriving(int horsePowerDriving) {
		HorsePowerDriving = horsePowerDriving;
	}
	public int getNumberOfDoors() {
		return NumberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getTypeOfFeul() {
		return TypeOfFuel;
	}
	public void setTypeOfFeul(String typeOfFeul) {
		TypeOfFuel = typeOfFeul;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getYearOfFabrication() {
		return yearOfFabrication;
	}
	public void setYearOfFabrication(int yearOfFabrication) {
		this.yearOfFabrication = yearOfFabrication;
	}
	public String getColorType() {
		return ColorType;
	}
	public void setColorType(String colorType) {
		ColorType = colorType;
	}
	
	public void TurnEngineOn() {
		System.out.println("Engine on!");
	}
	
	public void TurnEngineOff() {
		System.out.println("Engine off!");
	}
	
	public void Turning() {
		System.out.println("Specific type of turning for vehicle");
	}
}
