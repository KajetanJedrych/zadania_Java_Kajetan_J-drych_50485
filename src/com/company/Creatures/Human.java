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

    public void sortGarage() {
        Arrays.sort(this.garage);
    }

    public boolean hasCar(Car newCar) {
        return indexOf(garage, newCar) > -1;
    }

    public static int indexOf(Object[] array, Object o){
        for (int i = 0; i < array.length; ++i){
            if (array[i] == o)
                return i;
        }
        return -1;
    }

    public boolean hasFreeSpace() {
        return indexOf(garage, null) > -1;
    }
    public void removeCar(Car car) {
            garage[indexOf(garage, car)] = null;
    }

    public void addCar(Car newCar) {
        if (this.hasFreeSpace()) {
            int newIndex = indexOf(garage, null);
            garage[newIndex] = newCar;
        } else {
            System.out.println("nie masz tyle miejsca");
        }
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
