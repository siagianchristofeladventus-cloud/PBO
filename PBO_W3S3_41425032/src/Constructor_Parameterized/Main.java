/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor_Parameterized;

/**
 *
 * @author Christofel A S
 */

class Geeks {
    // Data member class
    String name;
    int id;

    // Parameterized constructor: nilai awal ditentukan saat objek dibuat
    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class Main {
    public static void main(String[] args) {
        // Memanggil parameterized constructor
        Geeks geek1 = new Geeks("Sweta", 68);
        System.out.println("GeekName: " + geek1.name
                + " and GeekId: " + geek1.id);
    }
}
