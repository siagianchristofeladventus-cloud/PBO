/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author Christofel A S
 */
import java.util.*;

class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
     
    }
}

class HarryPotter extends Penyihir
{
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra degnan tongkatnya yang unik");
        
    }
}


class Hermione extends Penyihir {
    @Override 
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantar dengan tepat dan percaya diri");
    }
}

    public class DemoPenyihir {
        public static void main(String[] args) {
            Penyihir penyihir1 = new HarryPotter();
            Penyihir penyihir2 = new Hermione();
            
            penyihir1.ucapkanMantra();
            penyihir2.ucapkanMantra();
        }
}

/*File ini memperkenalkan konsep method overriding dan polymorphism.
Terdapat sebuah superclass Penyihir yang memiliki method ucapkanMantra(),
lalu subclass seperti HarryPotter, Hermione, dan RonWeasley melakukan override
method tersebut untuk menampilkan cara mereka mengucapkan mantra dengan gaya 
masing-masing. Dengan polymorphism, kita dapat membuat array atau list berisi 
objek-objek dari subclass tetapi diperlakukan sebagai objek Penyihir, sehingga pemanggilan 
ucapkanMantra() akan secara dinamis memanggil versi yang sesuai dengan tipe objek sebenarnya.
Hal ini memperlihatkan manfaat polymorphism dalam menulis kode yang fleksibel dan mudah diperluas.
Jawaban Pertanyaan:

Jika annotation @Override dihapus, kode masih berjalan selama method memiliki signature yang benar. 
Namun, @Override membantu compiler memberi peringatan jika ternyata kita salah ketik nama 
method atau parameternya sehingga overriding gagal tanpa kita sadari.

Keuntungan polymorphism adalah kita bisa menulis kode yang lebih modular dan fleksibel. 
Kita tidak perlu memeriksa tipe objek satu per satu, cukup panggil method yang sama 
dan biarkan JVM mengeksekusi implementasi yang sesuai.
*/

