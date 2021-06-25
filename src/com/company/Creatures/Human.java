package com.company.Creatures;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.selleable;

import java.util.Date;

public class Human extends Animal implements selleable {
    private static  final String Human_Species = "Homo sapiens";
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal animal ;
    public Car car ;
    private  Double salary;
    Date date = new Date();
    private Car objCar;
    public  Double cash = 200.00;

    public Human(String lastName) {
        super(Human_Species);
        this.lastName = lastName;
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
