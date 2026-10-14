/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author Christofel A S
 */
import java.util.*;

public class Mantra {
 
   public void ucapkan(String namaMantra) {
       System.out.println("Mengucapkan mantra: " + namaMantra);
}
    
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
} else {
          System.out.println("Efek: Senjata terlepas.");
          }
        }


        public void ucapkan(String namaMantra, int kekuatan, String target) {
            System.out.println("Mengucapkan mantra:" + namaMantra + "dengan kekuatan" + kekuatan + " pada " + target);
       if (kekuatan > 10) {
           System.out.println("Efek: " + target + " terlempar!");
}   else {
           System.out.println("Efek: Senjata " + target + " terlepas ");
    }
}
            
        
    public static void main(String[] args) {
        Mantra mantra = new Mantra();
        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
    }
}

/*
File ini berisi class Mantra yang mencontohkan method overloading. 
Di dalamnya terdapat beberapa versi method ucapkan() dengan parameter 
berbeda—misalnya tanpa parameter, dengan parameter kekuatan, dan dengan
kombinasi parameter namaMantra dan target. Tujuannya adalah untuk 
menunjukkan bagaimana sebuah method bisa dipanggil dengan cara berbeda-beda
namun tetap memiliki nama yang sama. Overloading ini memungkinkan fleksibilitas, 
karena penyihir bisa mengucapkan mantra secara sederhana atau dengan detail 
tambahan seperti target dan tingkat kekuatan. Jika salah satu versi method dihapus,
maka pemanggilan yang cocok dengan parameter tersebut akan gagal dikompilasi. 
Dengan menambahkan variasi urutan parameter, kita juga bisa mendemonstrasikan bahwa Java 
membedakan overload berdasarkan tipe dan urutan parameter.

Jawaban Pertanyaan:

Jika salah satu method overloading dihapus (misalnya yang memiliki dua parameter), 
maka pemanggilan method dengan kombinasi parameter tersebut akan menimbulkan compile-time 
error karena Java tidak menemukan method yang cocok dengan parameter yang dipanggil.

Ya, kita bisa membuat method overloading dengan urutan parameter berbeda, seperti 
ucapkan(int kekuatan, String namaMantra). Java akan mengenali ini sebagai overload baru 
selama tipe dan urutannya berbeda dari method lain.
*/

