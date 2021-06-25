package com.company.Creatures;

public class Pet extends Animal {
    private static final double FoodWeight = 1;


    public Pet(String species) {
        super(species);
    }
    @Override
    public void beEaten()  {
        System.out.println("nie można jeść zwierząt domowych!!");
    }
    public void feed() {
        feed(FoodWeight);
    }
}
