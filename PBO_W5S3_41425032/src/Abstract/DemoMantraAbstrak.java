/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author Christofel A S
 */
import java.util.*;

abstract class MantraAbstrak {
    private String nama;
    
    public MantraAbstrak(String nama) {
        this.nama = nama;
    }
    
    public abstract void efek();
    
    public void ucapkan() {
            System.out.println("Mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
       super("Expelliarmus");
}

@Override 
public void efek() {
    System.out.println("Efek: Melucuti senjata lawan.");
}

}
class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }
    
    @Override 
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}
public class DemoMantraAbstrak {
    public static void main(String[] args) {
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
                
        mantra1.ucapkan();
        mantra1.efek();
        
        mantra2.ucapkan();
        mantra2.efek();
    }
}
 /*File ini mendemonstrasikan penggunaan abstract class melalui pembuatan 
class MantraAbstrak yang memiliki method abstrak efek(). Class ini tidak 
dapat diinstansiasi langsung, sehingga setiap subclass seperti Expelliarmus,
Stupefy, atau Lumos harus mengimplementasikan method efek() dengan perilaku 
spesifik masing-masing. Tujuannya adalah memastikan setiap jenis mantra memiliki
efek yang terdefinisi dengan jelas. Konsep ini membantu menciptakan kerangka (blueprint)
bagi semua mantra, sehingga programmer tidak lupa mendefinisikan efek pada mantra baru yang dibuat.
Jawaban Pertanyaan:

Jika kita mencoba membuat objek dari MantraAbstrak langsung, akan terjadi compile-time 
error karena abstract class tidak bisa diinstansiasi. Abstract class hanya dapat berfungsi 
sebagai superclass yang diwarisi oleh subclass konkret.

Kita perlu membuat abstract class agar bisa menentukan kontrak yang wajib diikuti oleh 
semua subclass. Keuntungannya adalah memastikan semua mantra memiliki method efek(), menjaga konsistensi, 
dan memudahkan pengembangan di masa depan karena setiap mantra baru hanya perlu mengisi implementasi efeknya.*/