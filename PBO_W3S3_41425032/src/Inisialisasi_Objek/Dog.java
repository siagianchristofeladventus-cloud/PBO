package Inisialisasi_Objek;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */
public class Dog {
    // Atribut (state) milik objek Dog
    String name;
    String breed;
    int age;
    String color;

    // Constructor untuk mengisi nilai awal atribut saat objek dibuat
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Getter: mengambil nilai atribut
    public String getName()  { return name; }
    public String getBreed() { return breed; }
    public int getAge()      { return age; }
    public String getColor() { return color; }

    // Override toString() agar objek tercetak dengan format yang jelas
    @Override
    public String toString() {
        return "Name is: " + this.getName()
                + "\nBreed, age, and color are: "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor();
    }

    public static void main(String[] args) {
        // Operator new mengalokasikan memori dan memanggil constructor
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}
