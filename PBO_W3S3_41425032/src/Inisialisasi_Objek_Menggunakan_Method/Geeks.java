/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inisialisasi_Objek_Menggunakan_Method;

/**
 *
 * @author Christofel A S
 */

public class Geeks {
    // Atribut static: dimiliki class, bukan objek
    static String name;
    static float price;

    // Method "set" untuk mengisi nilai atribut (initializer/setter method)
    static void set(String n, float p) {
        name = n;
        price = p;
    }

    // Method "get" untuk menampilkan nilai atribut
    static void get() {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }

    public static void main(String args[]) {
        // Method static dipanggil lewat nama class
        Geeks.set("Visual studio", 0.0f);
        Geeks.get();
    }
}