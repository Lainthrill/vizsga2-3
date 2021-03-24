package com.codecool.farm.animal;

public class Cattle extends Animal {
    private String name = "cattle";

    public String getName() {
        return name;
    }

    @Override
    public void feed() {
        size += 2;
    }

    @Override
    public int getSize() {
        return size;
    }
}
