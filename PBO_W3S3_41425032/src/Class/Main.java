/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Christofel A S
 */

// Class Student sebagai blueprint (cetak biru) objek mahasiswa
class Student {
    int id;      // atribut: nomor id
    String n;    // atribut: nama

    // Constructor: dipanggil otomatis saat objek dibuat dengan "new"
    public Student(int id, String n) {
        this.id = id;   // this.id = atribut milik objek, id = parameter
        this.n = n;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek s1 dari class Student (instansiasi)
        Student s1 = new Student(10, "Alice");

        // Mengakses atribut objek dengan operator titik
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}