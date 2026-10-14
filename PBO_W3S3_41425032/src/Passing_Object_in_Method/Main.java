/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Passing_Object_in_Method;

/**
 *
 * @author Christofel A S
 */

class ObjectPassDemo {
    int a, b;

    // Constructor mengisi nilai a dan b
    ObjectPassDemo(int i, int j) {
        a = i;
        b = j;
    }

    // Method menerima objek lain sebagai parameter,
    // lalu membandingkan nilai a dan b keduanya
    boolean equalTo(ObjectPassDemo o) {
        return (o.a == a && o.b == b);
    }
}

public class Main {
    public static void main(String args[]) {
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);

        // Objek dilewatkan ke method sebagai argumen
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2)); // true
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3)); // false
    }
}
