/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author Christofel A S
 */

/*
Nama  : Christofel Adventus Siagian
NIM   : 41425032
Tugas : PBO W04S03
 */

public class CorporateDiscount implements Discountable {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}
