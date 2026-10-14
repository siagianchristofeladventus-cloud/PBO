/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalize_dan_getClass;

/**
 *
 * @author Christofel A S
 */

public class Geeks {
    public static void main(String[] args) throws InterruptedException {
        // ===== finalize() =====
        Geeks t = new Geeks();
        System.out.println(t.hashCode());

        t = null;            // tidak ada lagi referensi ke objek
        System.gc();         // meminta Garbage Collector berjalan
        Thread.sleep(500);   // memberi waktu agar finalize() sempat dipanggil

        System.out.println("end");

        // ===== getClass() =====
        Object o = new String("GeeksForGeeks");
        Class<?> c = o.getClass();   // mendapat class asli (runtime class)
        System.out.println("Class of Object o is: " + c.getName());
    }

    // Dipanggil GC sebelum objek dihapus (sudah deprecated di Java baru)
    @Override
    @SuppressWarnings("removal")
    protected void finalize() {
        System.out.println("finalize method called");
    }
}
