/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */
public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        // (Dikomentari karena menyebabkan error kompilasi. Hapus // untuk mencoba.)
        //KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Instansiasi dari subclass konkret
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();                    // concrete method warisan parent
        fuso.angkutBarang("20 Unit Kulkas");     // implementasi milik TrukBox

        System.out.println("---------------------------------");

        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}