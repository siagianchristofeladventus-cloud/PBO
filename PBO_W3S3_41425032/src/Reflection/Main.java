/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reflection;

/**
 *
 * @author Christofel A S
 */

class Student {
    // Constructor tanpa parameter (dibutuhkan oleh reflection)
    public Student() {}
}

public class Main {
    public static void main(String[] args) {
        try {
            // Mencari class berdasarkan namanya (String) saat runtime.
            // Karena memakai package, nama class harus lengkap.
            Class<?> c = Class.forName("W3S3_Reflection.Student");

            // Membuat objek lewat constructor tanpa parameter
            Student s2 = (Student) c.getDeclaredConstructor().newInstance();
            System.out.println("Object created: " + s2);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found!");        // class tidak ditemukan
        } catch (NoSuchMethodException e) {
            System.err.println("No default constructor!");  // constructor default tidak ada
        } catch (Exception e) {
            e.printStackTrace();                            // error lainnya
        }
    }
}
