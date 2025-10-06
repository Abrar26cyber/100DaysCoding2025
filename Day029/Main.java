package Day029;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka 1 : ");
        int ab = in.nextInt();
        System.out.print("Masukkan angka 2 : ");
        int ac = in.nextInt();
        
        System.out.println("\n=====Perbandingan=====");
        boolean besar = ab > ac;
        boolean kecil = ab < ac;
        
        System.out.println("Apakah angka 1 lebih besar dari angka 2 : " + besar);
        System.out.println("Apakah angka 1 lebih kecil dari angka 2 : " + kecil);
    }
}
