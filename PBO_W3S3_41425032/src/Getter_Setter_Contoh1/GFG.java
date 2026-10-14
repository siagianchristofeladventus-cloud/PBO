/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Getter_Setter_Contoh1;

/**
 *
 * @author Christofel A S
 */

class GetSet {
    // private: tidak bisa diakses langsung dari luar class
    private String name;

    // Getter: mengambil nilai name
    public String getName() {
        return name;
    }

    // Setter: mengubah nilai name
    public void setName(String N) {
        this.name = N;
    }
}

class GFG {
    public static void main(String[] args) {
        GetSet obj = new GetSet();

        obj.setName("Geeks for Geeks");    // mengisi nilai lewat setter
        System.out.println(obj.getName()); // membaca nilai lewat getter
    }
}
