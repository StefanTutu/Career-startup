package com.cgm.main;

import java.util.Random;

import com.cgm.children.Airplane;
import com.cgm.children.Boat;
import com.cgm.children.Car;
import com.cgm.children.Motorcycle;
import com.cgm.interfaces.Air;
import com.cgm.interfaces.Ground;
import com.cgm.interfaces.Water;


public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Airplane airplane = new Airplane();
		Boat boat = new Boat();
		Car  car = new Car();
		Motorcycle motorcycle = new Motorcycle();
				
		Air air = new Airplane();
		Ground carType = new Car();
		Ground motorcycleType = new Motorcycle();
		Water water = new Boat();
		
		Ground AnonymousClassGround = new Ground() {

			@Override
			public void acceleration() {
				System.out.println("New type of vehicle on ground acceleration");
				
			}

			@Override
			public void braking() {
				System.out.println("New type of vehicle on ground braking");
				
			}

			@Override
			public void parking() {
				System.out.println("New type of vehicle on ground parking");
				
			}

			@Override
			public void towing() {
				System.out.println("New type of vehicle on ground  towing");
				
			}
			
		};
		
		air.Landing();
		air.TakeOff();
		air.MaxHeight();
		System.out.println("");
		
		carType.acceleration();
		carType.braking();
		carType.towing();
		carType.parking();
		System.out.println("");
		
		motorcycleType.acceleration();
		motorcycleType.braking();
		motorcycleType.towing();
		motorcycleType.parking();
		System.out.println("");
		
		water.Floating();
		water.Rowing();
		System.out.println("");
		
		AnonymousClassGround.acceleration();
		AnonymousClassGround.braking();
		AnonymousClassGround.towing();
		AnonymousClassGround.parking();
		System.out.println("");
		
		for(int i = 1; i<10;i++) 
		{
			airplane.setHorsePowerDriving(i);
			airplane.setColorType("Color"+i);
			airplane.setEngineTime(i+r.nextInt(1000)+500);
			airplane.setHorsePowerDriving(500+r.nextInt(100)+200);
			System.out.println(airplane.toString());
		}
		
		for(int i = 10; i<20;i++)
		{
			boat.setNumberOfDoors(4);
			System.out.println(boat.toString());
		}
		
		for(int i =20; i<30;i++)
		{
			car.setAutomaticTransmission(true);
			car.setYearOfFabrication(2000+i);
			System.out.println(car.toString());
		}
		
		for(int i= 30; i<40;i++) 
		{
			motorcycle.setSpeed(r.nextInt(100)+500);
		}
		
	}

}
