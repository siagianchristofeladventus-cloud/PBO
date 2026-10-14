/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */
class KurirReguler {
    // protected: dapat diakses oleh subclass (KurirDrone)
    protected String nama;

    // Constructor menyimpan nama kurir
    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // Method yang akan di-override oleh child class
    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}
