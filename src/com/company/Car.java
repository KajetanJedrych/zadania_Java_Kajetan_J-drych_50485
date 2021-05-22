package com.company;

public class Car {
    String model;
    String producer;
    int yearOfProduction;
    String colour;
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
