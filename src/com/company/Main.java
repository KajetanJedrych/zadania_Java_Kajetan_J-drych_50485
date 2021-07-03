package com.company;

import com.company.Creatures.Animal;
import com.company.Creatures.FarmAnimal;
import com.company.Creatures.Human;
import com.company.Creatures.Pet;
import com.company.devices.*;

import java.util.ArrayList;
import java.util.Arrays;

import java.net.MalformedURLException;


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
        Application google = new Application("1.0", "Google", 0d);
        Application linkedIn = new Application("0.3", "LinkedIn", 0d);
        Application intellij = new Application("2.3", "IntelliJ IDEA", 100d);
        Application spotify = new Application("1.9", "Spotify", 30d);
        Application test = new Application("0.2", "test", 120d);

        try{
            me.setCash(220d);
            me.phone.buyApp(me, google);
            me.phone.buyApp(me, linkedIn);
            me.phone.buyApp(me, test);
            me.phone.buyApp(me, intellij);
            me.phone.buyApp(me, spotify);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        me.sortGarage();
        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(me.phone.isInstalled(google));
        System.out.println(me.phone.isInstalled("Spotify"));
        System.out.println(me.phone.freeApps());
        System.out.println("Wartość aplikacji: " + me.phone.totalAppValue());
        ArrayList<Application> alphabetically = me.phone.appsAlphabetically();
        for (Application a : alphabetically){
            System.out.println(a.name + ", " + a.price);
        }
        System.out.println(alphabetically.toString());
        ArrayList<Application> byPrice = me.phone.appsByPrice();
        for (Application a : byPrice){
            System.out.println(a.name + ", " + a.price);
        }


    }
}
