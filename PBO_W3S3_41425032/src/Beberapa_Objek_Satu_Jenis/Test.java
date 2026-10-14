/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beberapa_Objek_Satu_Jenis;

/**
 *
 * @author Christofel A S
 */

class Animal {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

// Dog dan Cat adalah subclass dari Animal
class Dog extends Animal {
    @Override
    void suara() {
        System.out.println("Guk guk");
    }
}

class Cat extends Animal {
    @Override
    void suara() {
        System.out.println("Meong");
    }
}

public class Test {
    public static void main(String[] args) {
        // Variabel referensi parent class bisa menyimpan objek subclass
        Animal obj = new Dog();   // menggunakan objek Dog
        obj.suara();

        obj = new Cat();          // variabel yang sama, sekarang menyimpan objek Cat
        obj.suara();
    }
}
