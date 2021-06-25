package com.company.Creatures;
import com.company.Creatures.Human;
public class FarmAnimal extends Animal {
    public FarmAnimal(String species) {
        super(species);
    }

    public FarmAnimal(String species, Double weight) {
        super(species);
        this.weight = weight;
    }

    public String toString() {
        return "FarmAnimal " + super.toString();
    }

}