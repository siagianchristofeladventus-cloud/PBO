/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */
public class TantanganPolimorfisme {
    public static void main(String[] args) {
        System.out.println("=== TANTANGAN POLIMORFISME ===");

        // Array bertipe parent class, diisi objek child yang berbeda
        KendaraanEkspedisi[] armada = {
            new TrukBox("BK 1111 DEL", 5000),
            new MobilVan("BK 2222 DEL", 800),
            new MotorKurir("BK 3333 DEL", 50)
        };

        // Satu for-loop: method yang jalan ditentukan JVM saat runtime
        for (KendaraanEkspedisi k : armada) {
            k.infoKendaraan();
            k.angkutBarang("Paket Pesanan");
            System.out.println("-----");
        }
    }
}
