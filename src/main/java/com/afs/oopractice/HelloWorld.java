package com.afs.oopractice;

public class HelloWorld {

    public static void main(String[] args) {
        Car myBMW = new Car("BMW", 30);
        Truck myTruck = new Truck("GoGoVan", 10);

        myBMW.speedUp();
        myTruck.speedUp();
    }
}
