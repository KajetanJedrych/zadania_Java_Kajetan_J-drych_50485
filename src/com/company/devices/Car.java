package com.company.devices;
import com.company.Creatures.Human;
import com.company.selleable;

public abstract class Car extends Device implements selleable{
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
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("don't have this car");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception("to small garage");
        }
        if (buyer.getCash() < price) {
            throw new Exception("not enough money");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("transakcja się udała");
    }
    abstract public void refueal();
}
