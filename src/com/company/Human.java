package com.company;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal dog;
    private  Double salary;
    Date date = new Date();
    private Car objCar;
    public Human(Car obj){
        objCar = obj;
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
}
