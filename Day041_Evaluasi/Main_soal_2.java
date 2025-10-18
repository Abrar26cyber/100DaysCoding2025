package Day041_Evaluasi;

import java.util.Scanner;

public class Main_soal_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("=== Pilih Bangun Datar ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi panjang");
        System.out.println("3. Lingkaran");
        System.out.println("Masukkan pilihan: ");
        int pilihan = in.nextInt();
        
        if (pilihan == 1) {
            System.out.println("Masukkan sisi: ");
            int sisi = in.nextInt();
            double luas = sisi*sisi;
            System.out.println("Luas Bangun: " +luas);
        }else if (pilihan == 2) {
            System.out.println("Masukkan panjang: ");
            int panjang = in.nextInt();
            System.out.println("Masukkan lebar: ");
            int lebar = in.nextInt();
            double luas = panjang * lebar;
            System.out.println("Luas Bangun: " +luas);
        }else if (pilihan == 3) {
            System.out.println("Masukkan jari-jari: ");
            int jari = in.nextInt();
            double luas = 3.14 * (jari*jari);
            System.out.println("Luas Bangun: " +luas);
        }
    }

}
