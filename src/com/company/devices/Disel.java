package com.company.devices;

public class Disel extends Car {
    public Disel(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refueal() {
        System.out.println("1.Podjeżdzasz na stację pod dystrbutor z napisaem \"ON\" ");
        System.out.println("2.Otwierasz korek");
        System.out.println("3.Wlewasz paliwo");
        System.out.println("4.Zamykasz korek ");
        System.out.println("5.Płacisz i zmykasz");

    }
}
