package com.company.Creatures;

import com.company.selleable;

public class Animal implements selleable {
    final public String species;
    private Double weight;
    String name;
    public String toString(){
        return species+ " " + name+ " " + weight;
    }
    public Animal(String species) {
        this.species = species;
        if (this.species == "pitbull") {
            this.weight = 20.5;
        } else if (this.species == "horse") {
            this.weight = 167.5;
        }
    }
 void feed(){
        if(this.weight >=0.1){
        this.weight = this.weight + 5.0;
     System.out.println(this.name +" fed now it weight: "+this.weight);}
        else {      System.out.println("now is to late ");
        }
 }
 void  takeForWalk(){
        if(this.weight>=0.1){
        this.weight = this.weight - 5.0;
      System.out.println(this.name +" weight: "+this.weight);}
        else if(this.weight <= 0){
            System.out.println("too much walk, your pet "+ this.name +" die ");
        }
 }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (this instanceof Human){
            System.out.println("Nie można sprzedawać ludzi dzwonie o prokuratury!!!");
        }
        else if(seller.pet != this){
            System.out.println("nie posiadasz zwierzęcia");
        }
        else if(buyer.cash < price){
            System.out.println("Kupujący nie ma tyle kasy");
        }
        else { buyer.pet = this;
        seller.pet = null;
        buyer.cash -= price;
        seller.cash+= price;
            System.out.println("Brawo tranzakcja dokonana");}
    }
}
