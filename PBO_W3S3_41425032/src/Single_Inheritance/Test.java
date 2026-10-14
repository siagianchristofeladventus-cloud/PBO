package Single_Inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */

class Vehicle { // Super class (class induk)
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Subclass: Car mewarisi Vehicle (hanya dari satu induk)
class Car extends Vehicle {
    Car() {
        // constructor parent (Vehicle) dipanggil otomatis lebih dulu
        System.out.println("This Vehicle is Car");
    }
}

public class Test {
    public static void main(String[] args) {
        Car obj = new Car(); // mencetak output Vehicle dulu, baru Car
    }
}
