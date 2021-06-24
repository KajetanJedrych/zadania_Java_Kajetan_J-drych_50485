package com.company;

import com.company.Creatures.Animal;
import com.company.Creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Car seat = new Car("Seat","Leon", 2009);
        seat.colour = "Blue";
        Car bmw = new Car("BMW ","e90", 2010);
        bmw.colour = "Blue";
        Phone Nokia = new Phone("Nokia", "3310", 2001);
        Nokia.screanSize = 3.2;
        Nokia.os = "Windows";
        Human me = new Human("Jedrych");

        me.phone = Nokia;
        Animal Rico = new Animal("dog");
        me.pet = Rico;
        Human theBestJavaTeacher = new Human("Warda");
        theBestJavaTeacher.lastName = "Warda";
        Rico.sell(me,theBestJavaTeacher,3.00);
        System.out.println("3.00 wystarczy do pełni szczęścia");
        Animal PanKot = new Animal("Kot");
        me.pet = PanKot;
        PanKot.sell(me, theBestJavaTeacher, 4.00);
        Human someRandom = new Human("Random");
        me.pet = someRandom;
        someRandom.sell(me,theBestJavaTeacher,21.38);
        theBestJavaTeacher.car = bmw;
        bmw.sell(theBestJavaTeacher,me,5000.99);
        Nokia.sell(me,someRandom,39.99);









    }
}
