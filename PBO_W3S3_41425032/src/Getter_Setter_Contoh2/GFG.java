/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Getter_Setter_Contoh2;

/**
 *
 * @author Christofel A S
 */

class GetSet {
    private int num;

    // Setter dengan validasi: angka harus 1 sampai 10
    public void setNumber(int number) {
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException(); // tolak nilai di luar rentang
        }
        num = number;
    }

    // Getter: mengambil nilai num
    public int getNumber() {
        return num;
    }
}

class GFG {
    public static void main(String[] args) {
        GetSet obj = new GetSet();
        obj.setNumber(5);                   // nilai valid
        System.out.println(obj.getNumber());
    }
}
