package com.beginner.udemy.abstractexample;
public class DodgeChallenger extends Car implements ElectricMode{


    public DodgeChallenger(int price, int mileage){
        super("Dodge Challenger",  price, mileage);
    }

    @Override
    public void startTheEngine() {
        System.out.println("A Dodge Challenger engine is started.");
    }

    @Override
    public void startTheElectricEngine() {
        System.out.println("Dodge Challenger starts its electric engine.");
    }
}
