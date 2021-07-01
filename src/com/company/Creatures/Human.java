package com.company.Creatures;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.selleable;
import java.util.Arrays;
import java.util.Comparator;

import java.util.Date;

public class Human extends Animal implements selleable {
    private static  final String Human_Species = "Homo sapiens";
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal animal ;
    private static final Integer garageSize = 2;
    private Car[] garage;
    private  Double salary;
    Date date = new Date();
    private Car objCar;
    public  Double cash = 200.00;

    public Human(String lastName) {
        super(Human_Species);
        this.lastName = lastName;
        this.garage = new Car[garageSize];
    }

    public String toString(){
        return firstName+ " " + lastName+ " " + phone;
    }
    public Double getSalary(){
        System.out.println("Today is: " + date + " and your salary is: " + this.salary );

        return this.salary;
    }

    public void setSalary(Double newSalary){
        if (newSalary < 0 ){
            System.out.println("You cannot pay a company to work for it !!");
        }
        else {System.out.println("Date were sent to the accounting system\n" +
                "Your new contract waiting for you at Mrs. Hanna in a room 2137\n" +
                "Tax offices know about that You can't hide from them");
            salary = newSalary;

        }
    }
    public Car getCar(Integer index) {
        return garage[index];
    }

    public void setCar(Car car, Integer index) {
        this.garage[index] = car;
    }
    public Car[] getGarage() {
        return this.garage;
    }
    public double valueOfCars() {
        Double sum = 0.0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.value;
            }
        }
        return sum;
    }
    public Double getCash() {
        return cash;
    }
    public void setCash(Double cash) throws Exception {
        if (cash >= 0) {
            this.cash = cash;
        } else {
            throw new Exception("serio!?");
        }
    }

    public void sortGarage(Comparator comparator) {
        Arrays.sort(this.garage, comparator);
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar) throws Exception {
        if (this.hasFreeSpace()) {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    this.garage[i] = newCar;
                    break;
                }
            }
        } else {
            System.out.println("nie masz tyle miejsca");
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
