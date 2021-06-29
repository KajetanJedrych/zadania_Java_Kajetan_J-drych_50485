package com.company.devices;
import com.company.Creatures.Human;
import com.company.selleable;
import java.net.MalformedURLException;
import java.net.URL;


public class Phone extends Device implements selleable{
public Double screanSize;
public String os;
static final String serwer = "www.mojHost.pl";
static final String protocol = "https";
static final String version = "333";
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
    public void installAnApp(String appName) throws MalformedURLException {
        this.installAnApp(appName, 333);
    }

    public void installAnApp(String appName, Integer version) throws MalformedURLException {
        URL url = new URL(protocol, serwer, version,  appName);
        this.installAnApp(url);
    }
    public void installAnApp(String appName, Integer version, String host) throws MalformedURLException {
        URL url = new URL(protocol, host, version,  appName);
        this.installAnApp(url);
    }
    public void installAnApp(String[] names) throws MalformedURLException {
        for (String appName : names) {
            installAnApp(appName);
        }
    }

    public void installAnApp(URL url) {
        System.out.println("aplikacja zainstalowana " + url.getFile());
    }




}
