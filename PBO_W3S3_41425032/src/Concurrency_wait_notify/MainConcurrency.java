/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concurrency_wait_notify;

/**
 *
 * @author Christofel A S
 */


// Objek bersama yang dipakai thread produsen dan konsumen
class AntreanShared {
    private String data;                 // tempat menyimpan pesan
    private boolean adaData = false;     // penanda: true jika ada pesan

    // Dipakai produsen untuk mengirim pesan
    public synchronized void kirimPesan(String pesan) {
        while (adaData) {                // jika pesan lama belum diambil
            try {
                wait();                  // tunggu sampai konsumen mengambil
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = pesan;               // simpan pesan baru
        this.adaData = true;
        System.out.println("Pesan dikirim: " + pesan);

        notify();                        // beri tahu konsumen bahwa data siap
    }

    // Dipakai konsumen untuk mengambil pesan
    public synchronized String ambilPesan() {
        while (!adaData) {               // jika belum ada pesan
            try {
                wait();                  // tunggu sampai produsen mengirim
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.adaData = false;            // pesan sudah diambil
        System.out.println("Pesan diterima: " + data);

        notify();                        // beri tahu produsen bahwa tempat sudah kosong
        return data;
    }
}

public class MainConcurrency {
    public static void main(String[] args) {
        AntreanShared antrean = new AntreanShared(); // objek yang dibagi kedua thread

        // Thread produsen: mengirim 3 pesan
        Thread produsen = new Thread(() -> {
            String[] listPesan = {"Halo", "Belajar Java", "Selesai"};
            for (String p : listPesan) {
                antrean.kirimPesan(p);
            }
        });

        // Thread konsumen: mengambil 3 pesan
        Thread konsumen = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                antrean.ambilPesan();
            }
        });

        produsen.start();   // jalankan thread
        konsumen.start();
    }
}