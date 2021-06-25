package com.company.Creatures;
import  com.company.Creatures.Edible;


abstract public class Animal implements Edible, Feedable{
    final public String species;
    public Double weight;
    public String name;
    private static final double FoodWeight = 1;
    public Animal(String species) {
        this.species = species;

    }


    public void feed() {
        feed(FoodWeight);
    }

    public void feed(Double feedWeight) {
        if (weight <= 0) {
            System.out.println("On już nic nie zje");
        } else {
            weight += feedWeight;
            System.out.println(" Dzięki za jedzonko teraz ważę tyle: " + this.weight);
        }
    }
    @Override
    public void beEaten() {
        if (this instanceof Human) {
            System.out.println("Nie można zjadać ludzi dzwonię na policję");
        }
        System.out.println("zjadłeś to niewinne zwierzę");
        this.weight = 0.0;
    }

}





