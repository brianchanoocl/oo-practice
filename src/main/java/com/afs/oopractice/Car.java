package com.afs.oopractice;

public class Car {
    private final String name;
    private final int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp(){
        System.out.println(String.format("%s: speed to %d km/h", name, speed));
    }
}
