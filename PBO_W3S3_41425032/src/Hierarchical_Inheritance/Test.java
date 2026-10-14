/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hierarchical_Inheritance;

/**
 *
 * @author Christofel A S
 */

class Vehicle { // satu class induk
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Car dan Bus sama-sama mewarisi Vehicle
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

class Bus extends Vehicle {
    Bus() {
        System.out.println("This Vehicle is Bus");
    }
}

public class Test {
    public static void main(String[] args) {
        Car obj1 = new Car();  // objek Car
        Bus obj2 = new Bus();  // objek Bus
    }
}