package com.beginner.udemy.Polymorphismxample;
public class ToyotaSupra extends Car {
    public ToyotaSupra(int price, int mileage) {
        super("Toyota Supra", price, mileage);
    }

    @Override
    public void startTheEngine() {
        System.out.println("A Toyota Supra Engine is started.");
    }
}
