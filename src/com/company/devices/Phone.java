package com.company.devices;

public class Phone extends Device {
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
}
