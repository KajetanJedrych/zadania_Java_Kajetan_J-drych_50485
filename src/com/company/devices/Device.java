package com.company.devices;

abstract public class Device{
    public final String model;
    public final String producer;
    public final  Integer yearOfProduction;


    public Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }
    abstract public void turnOn();
}
