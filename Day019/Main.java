package Day019;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //konversi manual/dipaksa (darri tipe data besar ke kecil)
        Scanner in = new Scanner (System.in); 
        
        System.out.print("Masukkan angka \t\t : ");
        double angka1 = in.nextDouble();
        int konversi1 = (int)angka1;
        
        System.out.print("Masukkan \t\t : ");
        float angka2 = in.nextFloat();
        byte konversi2 = (byte)angka2;
        
        System.out.println();
        System.out.println("nilai dari variabel denggan tipe data double \t\t : " + angka1);
        System.out.println("konversi ke tipe data integer \t\t\t\t : " + konversi1);
        System.out.println();
        System.out.println("nilai dari variabel denggan tipe data float \t : " + angka2);
        System.out.println("konversi ke tipe data byte \t\t\t\t : " + konversi2);
       
    }  
}
