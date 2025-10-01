package Day024;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        
        System.out.println("\n===== menghitung luas lingkaran =====\n");
        
        System.out.print("Masukkan jari jari lingkaran : ");
        double r = masuk.nextDouble(); // r = jari-jari
        
        System.out.println("\n==== Rumus menghitung luas lingkarang===\n\nLuas lingakran \t\t\t = 3,14 * jari-jari * jari-jari");
        System.out.println( "Rumus lingakaran \t\t = 3,14 * r * r");
        
        double luas = Math.PI * r * r;
        
        System.out.printf("Jadi luas lingkaran \t\t = %.2f \n= ",luas);
    }  
}
