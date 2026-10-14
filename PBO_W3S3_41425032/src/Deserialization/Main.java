/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deserialization;

/**
 *
 * @author Christofel A S
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serializable = objek boleh diubah menjadi byte dan disimpan ke file
class Student implements Serializable {
    private static final long serialVersionUID = 1L; // versi class
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        // ===== Serialization: objek -> file =====
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("student.ser"))) {
            out.writeObject(new Student("Alice")); // tulis objek ke file
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ===== Deserialization: file -> objek =====
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("student.ser"))) {
            Student s = (Student) in.readObject(); // baca dan kembalikan jadi objek
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
