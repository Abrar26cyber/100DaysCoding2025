package Day018;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // konversi otomatis (dari tipe data kecil ke data besar)
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkkan Angka \t\t : ");
        int angka = in.nextInt();
        
        double konversi = angka;
        
        System.out.println("Angka Integer \t\t\t : " + angka);
        System.out.println("Angka konversi ke double \t : " + konversi);
    }
    
}
