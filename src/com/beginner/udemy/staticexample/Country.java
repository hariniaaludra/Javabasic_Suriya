package com.beginner.udemy.staticexample;

public class Country {
	 

    private static int numberOfCountries;
    private  String name;
    private int population;
    private String capital;


    public Country(String name, int population, String capital) {
       this. name = name;
        this.population = population;
        this.capital = capital;
        numberOfCountries++;
    }
    public final void populationChange(int change){
        population += change;
    }

    public void getDetails() {
        System.out.println("Country name: " + name + " Population: " + population + " Capital: " + capital);
    }

    static {
        numberOfCountries =20;
    }
    public static int getNumberOfCountries() {
        return numberOfCountries;
    }

   
}