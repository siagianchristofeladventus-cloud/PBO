/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */
class MesinTarif {
    // Kota asal pengiriman (di-enkapsulasi dengan private)
    private String kotaAsal;

    // Constructor: menginisialisasi kota asal
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // Versi 1: ongkir dasar = berat x Rp10.000 per Kg
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    // Versi 2: ongkir + asuransi (1% dari nilai barang)
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01; // hitung biaya asuransi
        return (beratKg * 10000) + biayaAsuransi;  // ongkir dasar + asuransi
    }

    // Versi 3: ongkir dengan opsi express (tambahan Rp20.000)
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000; // ongkir dasar
        if (isExpress) {
            total += 20000;             // biaya tambahan prioritas kilat
        }
        return total;
    }
}