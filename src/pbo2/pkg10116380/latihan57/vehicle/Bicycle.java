/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan57.vehicle;

/**
 * Nama : Zain Achmad Rizqullah 
 * Nim : 10116380
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang Kendaraan
 */
public class Bicycle extends Vehicle{
    
     private int myGearCount;
    
    public Bicycle(){
        System.out.println("Bicycle");
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
}
