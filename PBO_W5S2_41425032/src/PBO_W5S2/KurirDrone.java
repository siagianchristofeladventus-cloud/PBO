/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */
class KurirDrone extends KurirReguler {
    // Atribut khusus drone
    private String idDrone;

    // Constructor: memanggil constructor parent via super() lalu set idDrone
    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    // Override: perilaku pengiriman diganti menjadi lewat udara
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama +
                " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

