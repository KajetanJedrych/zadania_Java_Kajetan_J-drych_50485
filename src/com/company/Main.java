package com.company;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Car seat = new Car("Seat","Leon", 2009);
        seat.colour = "Blue";
        Human kajetan = new Human(seat);
        Car bmw = new Car("BMW ","e90", 2010);
        bmw.colour = "Blue";
        bmw.turnOn();
        System.out.println("seat.equals(bmw): " + seat.equals(bmw));
        Phone Nokia = new Phone("Nokia", "3310", 2001);
        Nokia.screanSize = 3.2;
        Nokia.os = "Windows";
        System.out.println(seat);
        System.out.println(bmw);
        Human Kajetan = new Human(seat);
        Kajetan.firstName = "Kajetan";
        Kajetan.lastName = "Nowak";
        Kajetan.phone = Nokia;








    }
}
