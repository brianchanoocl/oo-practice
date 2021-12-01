package com.afs.oopractice;

public abstract class Vehicle {
    private final String name;
    private final int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp(){
        System.out.println(String.format("%s: speed to %d km/h", name, speed));
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
