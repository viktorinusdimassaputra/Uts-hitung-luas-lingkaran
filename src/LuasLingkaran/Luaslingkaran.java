/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuasLingkaran;

/**
 *
 * @author WINDOWS 11
 */
public class Luaslingkaran {
    final double PI = 3.141592;

    void hitungLuas(double r) {
        double luas = PI * r * r;

        System.out.println("Luas dalam bilangan pecahan: " + luas);
        System.out.println("Luas dalam bilangan bulat (type casting): " + (int) luas);
        System.out.println("Luas dalam pembulatan (rounding): " + Math.round(luas));
    }
}