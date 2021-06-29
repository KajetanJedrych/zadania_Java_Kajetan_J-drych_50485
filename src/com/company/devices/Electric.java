package com.company.devices;

public class Electric extends Car{
    public Electric(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refueal() {
        System.out.println("1.Szukasz stacji ładowania w towjej okolicy");
        System.out.println("2.Podjeżdzasz");
        System.out.println("3.Podłączasz swój samochód do stacji ładowania pojazdów");
        System.out.println("4.1 Czekasz");
        System.out.println("4.2 Czekasz");
        System.out.println("4.3 Czekasz");
        System.out.println("4.4 Czekasz");
        System.out.println("4.5 Idziesz na zakupy");
        System.out.println("4.6 Wracasz z zakupów");
        System.out.println("4.7 O jeszcze masła zapomnaiłem muszę sie wrócić do sklepu!");
        System.out.println("5 Wracasz, o już w połowie naładowane można jechać");
        System.out.println("6.Płacisz i zmykasz");

    }
}
