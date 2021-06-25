package com.company.devices;
import com.company.Creatures.Human;
import com.company.selleable;
public class Phone extends Device implements selleable{
public Double screanSize;
public String os;

public  Phone(String producer, String model, Integer yerOfProduction){
    super(producer, model, yerOfProduction);
}

    @Override
    public void turnOn() {
        System.out.println("Przytrzymaj 2 sekund przycisk power");
        System.out.println("poczekaj na rozruch systemu");
    }

    public String toString(){
        return producer+ " " + model+ " " + screanSize+ " "+ os;}

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.phone != this){
            System.out.println("nie posiadasz telefonu");
        }
        else if(buyer.cash < price){
            System.out.println("Kupujący nie ma tyle kasy");
        }
        else { buyer.phone = this;
            seller.phone = null;
            buyer.cash -= price;
            seller.cash+= price;
            System.out.println("Brawo tranzakcja dokonana");}
    }
}
