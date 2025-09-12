/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day005;


public class Main {
    public static void main(String[] args) {
        //pemanggilan tipe data numerik bilangan bulat
        
        //pemanggilan tipe data byte. dengan 8 bite sehingga memiliki rentang nilai  antara -128 hingga 127
        byte nomorUrut = 78;
        
        //pemanggilan tipe data short. dengan 16 bite, rentang nilai -32.786 hingga 32.767
        short antrian = 3000;
        
        //pemanggilan tipe data int. dengan 32 bite, rentang nilai -2.147.483.648. hingga 2.147.438.647
        int umur = 18;
        
        //pemanggilan tipe data long. dengan 64 bite, rentang nilai -9.223.372.036.854.775.808 hingga 9.223.372.036.854.775.807(tak hingga)
        long kk = 24680;  
        
        System.out.println("Nomor urut:" + nomorUrut);
        System.out.println("Antrian:" + antrian);
        System.out.println("Umur" + umur);
        System.out.println("Anggota ke:" + kk);
        
    }
    
}
