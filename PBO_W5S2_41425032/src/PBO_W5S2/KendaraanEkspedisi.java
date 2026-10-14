/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */
abstract class KendaraanEkspedisi {
    // Atribut yang diwariskan ke subclass
    protected String noPolisi;
    protected int kapasitasKg;

    // Constructor abstract class (dipanggil subclass lewat super())
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Concrete method: sudah punya isi, langsung diwariskan
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // Abstract method: tanpa body, wajib diimplementasikan subclass konkret
    public abstract void angkutBarang(String namaBarang);
}
