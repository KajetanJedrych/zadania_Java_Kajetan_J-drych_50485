package com.company;

public class Main {

    public static void main(String[] args) {
        Car seat = new Car();
        seat.model = "Leon";
        seat.producer = "Seat";
        seat.yearOfProduction = 2010;
        seat.colour = "silver";
        Human kajetan = new Human(seat);
        Car bmw = new Car();
        bmw.model = "Leon";
        bmw.producer = "Seat";
        bmw.yearOfProduction = 2010;
        bmw.colour = "silver";
        System.out.println("seat.equals(bmw): " + seat.equals(bmw));
        Phone Nokia = new Phone();
        Nokia.produser ="Nokia";
        Nokia.model = "3310";
        Nokia.screanSize = 3.2;
        Nokia.os = "Windows";
        System.out.println(seat);
        System.out.println(bmw);
        Human Kajetan = new Human(seat);
        Kajetan.firstName = "Kajetan";
        Kajetan.lastName = "Nowak";
        Kajetan.phone = Nokia;


        Animal dog = new Animal("pitbull");
        dog.name = "Szarik";
        dog.feed();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.feed();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.feed();
        dog.takeForWalk();
        dog.takeForWalk();
        System.out.println(dog);
        System.out.println(Kajetan);
        System.out.println(Nokia);






    }
}
