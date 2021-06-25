package com.company;

import com.company.Creatures.Animal;
import com.company.Creatures.FarmAnimal;
import com.company.Creatures.Human;
import com.company.Creatures.Pet;
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

        Human theBestJavaTeacher = new Human("Warda");
        theBestJavaTeacher.lastName = "Warda";



        Human someRandom = new Human("Random");
        me.animal = someRandom;
        someRandom.sell(me,theBestJavaTeacher,21.38);
        theBestJavaTeacher.car = bmw;
        bmw.sell(theBestJavaTeacher,me,5000.99);
        Nokia.sell(me,someRandom,39.99);

        Animal dog = new Pet("Dog");
        Animal pig = new FarmAnimal("pig");
        Animal cow = new FarmAnimal("cow");
        Human Carl = new Human("Nowak");
        dog.weight =  10.2;
        pig.weight =  35.1;
        cow.weight = 100.3;
        Carl.weight = 88.7;
        pig.beEaten();
        dog.beEaten();
        cow.feed();
        cow.feed(34.2);
        Carl.beEaten();











    }
}
