package com.codecool.farm.animal;

public class Pig extends Animal {
    private String name = "pig";

    public String getName() {
        return name;
    }

    @Override
    public void feed() {
        size += 1;
    }

    @Override
    public int getSize() {
        return size;
    }
}
