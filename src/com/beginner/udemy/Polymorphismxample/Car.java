package com.beginner.udemy.Polymorphismxample;

public abstract class Car {


    private int price ;
    private int mileage;
    private String carName;

    public Car(String carName, int price, int mileage){
        this.carName = carName;
        this.price = price;
        this.mileage = mileage;
    }

    public abstract void startTheEngine();

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
        System.out.println("int function is called.");
    }

    public void drive(double mileage) {
        int wholeNumberMileage = (int) Math.round(mileage);
        this.mileage += Math.abs(wholeNumberMileage);
        System.out.println("double function is called.");
    }

    public String getCarName() {
        return carName;
    }
}
