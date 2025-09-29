package Day022;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("\n======= menghitung luas persegi =======\n");
        
        System.out.print("Masukkan panjang satu sisi : ");
        double sisi = masuk.nextDouble();
        
        double luas = sisi * sisi;
        
        System.out.println("luas sebuah persegi dengan panjang sisi " + sisi + "\nadalah : " + luas);
    }
    
}
