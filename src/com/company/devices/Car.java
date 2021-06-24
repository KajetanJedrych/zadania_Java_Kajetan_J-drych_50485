package com.company.devices;

public class Car extends Device {
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

}
