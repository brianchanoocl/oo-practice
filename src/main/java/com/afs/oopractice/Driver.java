package com.afs.oopractice;

public class Driver {
    private Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void speedUp() {
        System.out.println(String.format("%s: speed to %d km/h", vehicle.getName(), vehicle.getSpeed()));
    }
}
