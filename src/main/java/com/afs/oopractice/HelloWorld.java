package com.afs.oopractice;

public class HelloWorld {

    // [oo practice] [Brian] -feat

    public static void main(String[] args) {
        Car myBMW = new Car("BMW", 30);
        Truck myTruck = new Truck("GoGoVan", 10);
        Driver carDriver = new Driver(myBMW);
        Driver truckDriver = new Driver(myTruck);
        Car gasolineCar = new Car("Gasoline car", new GasolineEngine());
        Car electricCar = new Car("Electric car", new ElectricEngine());

        myBMW.speedUp();
        myTruck.speedUp();
        carDriver.speedUp();
        truckDriver.speedUp();
        gasolineCar.speedUp();
        electricCar.speedUp();
    }
}
