/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toString_Method;

/**
 *
 * @author Christofel A S
 */

public class Student {

    // Override toString() bawaan class Object.
    // Tanpa override, hasilnya berupa NamaClass@kodeHash
    @Override
    public String toString() {
        return "Student object";
    }

    public static void main(String[] args) {
        Student s = new Student();               // membuat objek Student
        System.out.println(s.toString());        // memanggil toString()
    }
}
