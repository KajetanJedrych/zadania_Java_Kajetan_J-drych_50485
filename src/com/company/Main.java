package com.company;

import com.company.Creatures.Animal;
import com.company.Creatures.FarmAnimal;
import com.company.Creatures.Human;
import com.company.Creatures.Pet;
import com.company.devices.*;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        Disel seat = new Disel("Seat","Leon", 2009);
        seat.colour = "Blue";
        LPG bmw = new LPG("BMW ","e90", 2010);
        bmw.colour = "Blue";
        Electric toyota = new Electric("Toyota", "Corolla",2020);
        Phone Nokia = new Phone("Nokia", "3310", 2001);
        Nokia.screanSize = 3.2;
        Nokia.os = "Windows";
        Human me = new Human("Jedrych");
        seat.refueal();

        me.phone = Nokia;

        Human theBestJavaTeacher = new Human("Warda");
        theBestJavaTeacher.lastName = "Warda";



        Human someRandom = new Human("Random");
        me.animal = someRandom;
        someRandom.sell(me,theBestJavaTeacher,21.38);
        theBestJavaTeacher.car = bmw;
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
        seat.refueal();
        bmw.refueal();
        toyota.refueal();
        Nokia.installAnApp("NaszaKlasa",2);
        String[] apps = new String[]{"NaszaKlasa", "GG", "Warms"};
        Nokia.installAnApp(apps);
        Nokia.installAnApp("GaduGadu");
        Nokia.installAnApp("NaszaKlasa",2,"www.mojHost.pl");














    }
}
