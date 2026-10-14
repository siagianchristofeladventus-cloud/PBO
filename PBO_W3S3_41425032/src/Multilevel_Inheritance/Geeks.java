package Multilevel_Inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */

class Vehicle { // level 1
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

class FourWheeler extends Vehicle { // level 2, mewarisi Vehicle
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}

class Car extends FourWheeler { // level 3, mewarisi FourWheeler
    Car() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

public class Geeks {
    public static void main(String[] args) {
        // Urutan constructor: Vehicle -> FourWheeler -> Car
        Car obj = new Car();
    }
}