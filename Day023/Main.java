package Day023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("\n===== menghitung luas persegi panjang =====\n");
        System.out.print("Masukkan panjang persegi \t : ");
        float panjang = in.nextFloat();
        
        System.out.print("Masukkan lebar persegi \t\t : ");
        float lebar = in.nextFloat();
        
        System.out.println("\n===Rumus menghitung luas persegi panjang===");
        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang \t = pannjang * lebar ");
        System.out.println("maka, luas\t\t = " + panjang + " cm " + " * " + lebar + " cm ");
        
        System.out.println("jadi luas sebuah persegi panjang adalah : " + luas + " cm");
    }
    
}
