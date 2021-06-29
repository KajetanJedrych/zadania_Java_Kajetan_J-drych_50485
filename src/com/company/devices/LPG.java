package com.company.devices;

public class LPG extends Car{
    public LPG(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refueal() {
        System.out.println("1.Podjeżdzasz na stację która posiada dystrbutor do gazu");
        System.out.println("2.Proszisz pracowniak stacji żeby zatankował Ci gazu za 5 zł ");
        System.out.println("3.Idziesz zapłacić");
        System.out.println("4 Odmawiasz kupna HOT-DOGA");
        System.out.println("4.1 Odmawiasz kupna Choinki o zapachu kokosowym do malucha");
        System.out.println("4.2 Odmawiasz kupna kawy");
        System.out.println("4.3 Odmawiasz założenia karty na punkty");
        System.out.println("5.Płacisz i zmykasz");
    }
}
