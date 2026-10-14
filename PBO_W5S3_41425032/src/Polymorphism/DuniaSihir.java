/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Christofel A S
 */
import java.util.*;

import java.util.ArrayList;
import java.util.List;

abstract class Mantra {
    private String nama;
    
    public Mantra(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }
    
    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum(){
        super("Expecto Patronum");
    }
    
    @Override
    public void efek(){
        System.out.println("Memanggil Patronus!");
}
}
    
    class Lumos extends Mantra {
        public Lumos() {
            super("Lumos");
        }
        
        @Override 
        public void efek() {
            System.out.println("Menerangi ujung tongkat!");
        }
    }
    
    class Penyihir {
        private String nama;
        private List<Mantra> mantraList;
        
        public Penyihir(String nama) {
            this.nama = nama;
            this.mantraList = new ArrayList<>();
        }
        
        public void belajarMantra(Mantra mantra) {
            mantraList.add(mantra);
            System.out.println(nama + " belajar mantra: " + mantra.getNama());
        }
        
        public void ucapkanMantra(String namaMantra) {
            for (Mantra mantra: mantraList) {
                if (mantra.getNama().equals(namaMantra)) {
                    System.out.println(nama +" mengucapkan " + mantra.getNama());
                    mantra.efek();
                    return;
            }
        }
            System.out.println(nama + " belum belajar mantra " + namaMantra);
    }
    }
    
public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum  = new ExpectoPatronum();
        
        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);
        
        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos");
        
        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");
    }
}

/*File ini merupakan kombinasi dari polymorphism dan abstract class untuk 
membuat sistem sihir yang lebih kompleks. Penyihir memiliki koleksi mantra 
(disimpan dalam list atau array), dan dapat memanggil ucapkanSemuaMantra() 
untuk menjalankan efek semua mantra yang telah dipelajarinya. Karena semua 
mantra merupakan turunan dari MantraAbstrak, maka efek yang dipanggil akan 
bergantung pada implementasi masing-masing subclass. Hal ini menunjukkan kekuatan
polymorphism: kode pada class Penyihir tidak perlu tahu detail setiap mantra,
cukup memanggil method efek() dan hasilnya disesuaikan secara dinamis.
Jawaban Pertanyaan:

Polymorphism dan abstract class bekerja sama dengan cara abstract class mendefinisikan 
kontrak (method abstrak efek()) sedangkan polymorphism memungkinkan kita memanggil 
method tersebut pada referensi bertipe superclass (MantraAbstrak) tetapi dijalankan 
sesuai implementasi subclass yang sebenarnya.

Jika kita menambahkan mantra baru, kita cukup membuat subclass baru dari MantraAbstrak 
dan mengimplementasikan efek(). Kita tidak perlu mengubah kelas Penyihir karena method 
ucapkanSemuaMantra() akan tetap berfungsi untuk semua jenis mantra baru. Ini menunjukkan 
bahwa sistem mudah diekstensikan tanpa mengubah kode yang sudah ada (open-closed principle).*/