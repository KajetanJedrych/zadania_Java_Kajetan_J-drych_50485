package com.company.devices;

abstract public class Device implements Comparable<Device>{
    public final String model;
    public final String producer;
    public final  Integer yearOfProduction;
    public double value = 3000.00;


    public Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }
    abstract public void turnOn();

    @Override
    public int compareTo(Device o) {
        if (this == null) {
            return 1;
        } else if (o == null) {
            return -1;
        }
        return Integer.compare(this.yearOfProduction, o.yearOfProduction);
    }
}
