package com.company.devices;
import com.company.Creatures.Human;
import com.company.selleable;

public class Car extends Device implements selleable{
   public String colour;

   public Car (String producer, String model, Integer yearOfProduction){
       super(producer, model, yearOfProduction );

   }

    @Override
    public void turnOn() {
        System.out.println("otwórz drzwi");
        System.out.println("Włóż kluczy w stacyjkę");
        System.out.println("przekręć");
        System.out.println("Poczekaj aż silnikz zxapali");
    }

    public String toString(){
        return model+ " " + producer+ " " + colour;
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Car) {
            Car otherCar = (Car) obj;
            return model.equals(otherCar.model) &&
                    producer.equals(otherCar.producer) &&
                    yearOfProduction == otherCar.yearOfProduction &&
                    colour.equals(otherCar.colour);
        }
        return false;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.car != this){
            System.out.println("nie posiadasz samochodu");
        }
        else if(buyer.cash < price){
            System.out.println("Kupujący nie ma tyle kasy");
        }
        else { buyer.car = this;
            seller.pet = null;
            buyer.cash -= price;
            seller.cash+= price;
            System.out.println("Brawo tranzakcja dokonana");}
    }
}
