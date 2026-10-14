/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */
class MotorKurir extends KendaraanEkspedisi {
    public MotorKurir(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Solusi 1 dari IDE: implement abstract method
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Motor Kurir [" + noPolisi + "] membawa '" + namaBarang +
                "' dengan box di belakang jok.");
    }
}
