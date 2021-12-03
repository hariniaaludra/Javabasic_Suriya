package com.beginner.udemy.encapsulation;

import java.util.Random;

public class Car {
	private byte numberOfSeats ;
	    private byte numberOfDoors ;
	    private byte numberOfVehicleOwners ;
	    private byte emissionSticker;

	    private short power ;
	    private short horsePower ;
	    private short co2Emission ;
	    private short cubicCapacity ;

	    private int price ;
	    private int mileage ;

	    private long registrationNumber ;

	    private float fuelConsumptionCombined;
	    private float fuelConsumptionUrban;
	    private float fuelConsumptionExtraUrban;

	    private double fuelConsumptionPreciseAverage;

	    private boolean isDamaged ;
	    private char energyEfficiencyCategory;

	    private String color;
	    private String carName;

	    public Car(String carName, String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
	                           int price, int mileage, boolean isDamaged){
	        this.carName = carName;
	        this.color = color;
	        this.numberOfVehicleOwners = numberOfVehicleOwners;
	        this.power = power;
	        this.horsePower = horsePower;
	        this.cubicCapacity = cubicCapacity;
	        this.price = price;
	        this.mileage = mileage;
	        this.isDamaged = isDamaged;
	        Random randomNumberGenerator = new Random();
	        this.registrationNumber = randomNumberGenerator.nextLong();
	    }

	   public void startTheEngine(){
	        System.out.println("The engine is started.");
	    }

	 /* void getDescription(){
	        System.out.println("A " + color + " " + carName + " is created.");
	        System.out.println("Price: €" + price);
	        System.out.println("Mileage: " + mileage + "km");
	        System.out.println("The car is damaged: " + isDamaged);
	        System.out.println("Registration number: " + registrationNumber);
	        System.out.println("Cubic capacity: " + cubicCapacity);
	        System.out.println("Power: " + power + "kW(" + horsePower + "hp)");
	        System.out.println("CO2 emission: " + co2Emission + "g/km");
	        System.out.println("Emission sticker: " + emissionSticker + " ( Energy efficiency: " + energyEfficiencyCategory + ")");
	        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + "l/100km");
	        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + "l/100km");
	        System.out.println("Extra urban fuel consumption: " + fuelConsumptionExtraUrban + "l/100km");
	        System.out.println("Precise combined fuel consumption: " + fuelConsumptionPreciseAverage + "l/100km");
	        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
	        System.out.println("Number of doors: " + numberOfDoors);
	        System.out.println("Number of seats: " + numberOfSeats);
	   }*/
	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = Math.abs(price);
	    }

	    public int getMileage() {
	        return mileage;
	    }

	    public void drive(int mileage) {
	        this.mileage += Math.abs(mileage);
	    }

	    public String getCarName() {
	        return carName;
	   }

}
