package Day030;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan angka\t: ");
        int angka = in.nextInt();
        
        int angka1 = 50;
        
        System.out.println("Apakah angka " +angka+ " lebih kecil sama dengan " +angka1+ " : " + (angka <= angka1));
        System.out.println("Apakah angka " +angka+ " lebih besar sama dengan " +angka1+ " : " + (angka >= angka1));
    }
}
