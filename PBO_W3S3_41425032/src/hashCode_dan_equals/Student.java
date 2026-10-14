/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashCode_dan_equals;

/**
 *
 * @author Christofel A S
 */

public class Student {
    int roll; // nomor induk mahasiswa

    // hashCode() dibuat berdasarkan nilai roll
    @Override
    public int hashCode() {
        return roll;
    }

    // equals(): dua Student dianggap sama jika roll-nya sama
    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {                    // cek tipe objek
            return this.roll == ((Student) o).roll;    // bandingkan isi
        }
        return false;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 101;

        Student s2 = new Student();
        s2.roll = 101;

        Student s3 = new Student();
        s3.roll = 102;

        // Menampilkan hashCode
        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
        System.out.println("HashCode s3: " + s3.hashCode());

        // Menampilkan hasil equals
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // false
    }
}