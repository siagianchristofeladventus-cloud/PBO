/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objek_Anonymous;

/**
 *
 * @author Christofel A S
 */

class Hello {
    void sapa() {
        System.out.println("Halo dari objek anonymous!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Objek anonymous: dibuat tanpa disimpan ke variabel,
        // dipakai sekali lalu dibuang
        new Hello().sapa();

        // Anonymous class: objek Runnable tanpa nama class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class berjalan");
            }
        };
        r.run();

        // Anonymous object melalui lambda
        Runnable r2 = () -> System.out.println("Lambda berjalan");
        r2.run();
    }
}
