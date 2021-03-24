package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

    private List<Animal> listOfAnimals = new ArrayList<>();

    public Farm(List<Animal> listOfAnimals) {
        this.listOfAnimals = listOfAnimals;
    }

    public List<Animal> getAnimals() {
        return listOfAnimals;
    }

    public void feedAnimals() {
        for (Animal animal : listOfAnimals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        listOfAnimals.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return listOfAnimals.isEmpty();
    }

    public List<String> getStatus() {
        List<String> listToReturn = new ArrayList<>();
        for (int i = 0; i < listOfAnimals.size(); i++) {
            listToReturn.add("There is a " + listOfAnimals.get(i).getSize()
                    + " sized " + listOfAnimals.get(i).getName()
                    + " in the farm.");
        }

        return listToReturn;
    }

}
