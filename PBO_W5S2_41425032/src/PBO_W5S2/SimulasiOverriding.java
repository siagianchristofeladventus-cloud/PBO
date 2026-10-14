/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */
public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");

        // Referensi parent -> objek parent
        KurirReguler k1 = new KurirReguler("Budi");
        // Referensi parent -> objek child (upcasting)
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        // Perintah sama, perilaku berbeda sesuai objek aslinya
        k1.kirimBarang("Jl. Sudirman No. 10");   // versi KurirReguler (darat)
        k2.kirimBarang("Gedung Graha Lt. 5");    // versi KurirDrone (udara)
    }
}

