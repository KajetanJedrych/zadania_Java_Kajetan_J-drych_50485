package com.company.devices;
import com.company.Creatures.Human;
import com.company.selleable;
import java.util.ArrayList;
import java.util.Date;

public abstract class Car extends Device implements selleable{
   public String colour;
    public ArrayList<Transaction> transactions;

   public Car (String producer, String model, Integer yearOfProduction){
       super(producer, model, yearOfProduction );
       transactions = new ArrayList<>();
   }

    @Override
    public void turnOn() {
        System.out.println("otwórz drzwi");
        System.out.println("Włóż kluczy w stacyjkę");
        System.out.println("przekręć");
        System.out.println("Poczekaj aż silnikz zxapali");
    }

    public String toString(){
        return model+ " " + producer+ " " + colour;
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Car) {
            Car otherCar = (Car) obj;
            return model.equals(otherCar.model) &&
                    producer.equals(otherCar.producer) &&
                    yearOfProduction == otherCar.yearOfProduction &&
                    colour.equals(otherCar.colour);
        }
        return false;
    }
    public void newTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    public void newTransaction(Human newOwner, Double price){
        newTransaction(new Transaction(newOwner, currentOwner(), price));
    }

    public Human currentOwner(){
        return transactions.get(transactions.size() - 1).buyer;
    }

    public int transactionsCount(){
        int count = 0;
        for (Transaction t : transactions){
            if (t.seller != null)
                count++;
        }
        return count;
    }

    public boolean hasSold(Human seller, Human buyer){
        for (Transaction t : transactions){
            if (t.buyer == buyer && t.seller == seller)
                return true;
        }
        return false;
    }

    public boolean wasOwner(Human h){
        for (Transaction t : transactions){
            if (t.buyer == h)
                return true;
        }
        return false;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this) || currentOwner() != seller) {
            throw new Exception("don't have this car");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception("to small garage");
        }
        if (buyer.getCash() < price) {
            throw new Exception("not enough money");
        }
        newTransaction(buyer, price);
        seller.removeCar(this);
        buyer.addCar(this);
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("transakcja się udała");
    }
    abstract public void refueal();
    public static class Transaction{
        Human buyer, seller;
        Double price;
        Date date;

        public Transaction(Human buyer, Human seller, Double price) {
            this.buyer = buyer;
            this.seller = seller;
            this.price = price;
            //Data transakcji dokładna co do milisekundy
            date = new Date();
        }

        public Human getBuyer() {
            return buyer;
        }

        public Human getSeller() {
            return seller;
        }

        public Double getPrice() {
            return price;
        }

        public Date getDate() {
            return date;
        }
    }
}
