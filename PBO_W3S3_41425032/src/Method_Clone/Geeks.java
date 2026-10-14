package Method_Clone;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christofel A S
 */

// Cloneable = penanda bahwa objek boleh disalin dengan clone()
class Geeks implements Cloneable {

    // Override clone() dari class Object agar dapat dipanggil dari luar
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // super mengacu ke parent class (Object)
    }

    String name = "GeeksForGeeks";

    public static void main(String[] args) {
        Geeks o1 = new Geeks();   // objek asli

        try {
            Geeks o2 = (Geeks) o1.clone();  // objek salinan
            System.out.println(o2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();  // muncul jika class tidak implements Cloneable
        }
    }
}