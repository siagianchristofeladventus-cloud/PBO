/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */
public class SimulasiOverloading {
    public static void main(String[] args) {
        // Membuat objek MesinTarif dengan kota asal Medan
        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== INI METHOD OVERLOADING ===");
        // Memanggil versi 1 (1 parameter double)
        System.out.println("Ongkir Biasa (2.0 Kg)        : Rp " + tarif.hitungOngkir(2.0));
        // Memanggil versi 2 (2 parameter double, double)
        System.out.println("Ongkir + Asuransi (Barang 5Jt): Rp " + tarif.hitungOngkir(2.0, 5000000.0));
        // Memanggil versi 3 (double, boolean)
        System.out.println("Ongkir Express (2.0 Kg)      : Rp " + tarif.hitungOngkir(2.0, true));
    }
}
