package Day041_Evaluasi;

import java.util.Scanner;

public class Main_soal_Tambahan {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("==== KALKULATOR ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan: ");
        int pilih = in.nextInt();
        
        if (pilih == 1) {
            System.out.print("\nMasukkan angka 1: ");
            int a = in.nextInt();
            System.out.print("Masukkan angka 2: ");
            int b = in.nextInt();
            int hasil = a + b;
            System.out.printf("%n%d + %d = %d%n", a, b, hasil);
        }else if (pilih == 2) {
            System.out.print("\nMasukkan angka 1: ");
            int a = in.nextInt();
            System.out.print("Masukkan angka 2: ");
            int b = in.nextInt();
            int hasil = a - b;
            System.out.printf("%n%d - %d = %d%n", a, b, hasil);
        }
        if (pilih == 3) {
            System.out.print("\nMasukkan angka 1: ");
            int a = in.nextInt();
            System.out.print("Masukkan angka 2: ");
            int b = in.nextInt();
            int hasil = a * b;
            System.out.printf("%n%d * %d = %d%n", a, b, hasil);
        }
        if (pilih == 4) {
            System.out.print("\nMasukkan angka 1: ");
            double a = in.nextInt();
            System.out.print("Masukkan angka 2: ");
            double b = in.nextInt();
            double hasil = a / b;
            System.out.printf("%n%.0f / %.0f = %.1f%n", a, b, hasil);
        }
    }
}
