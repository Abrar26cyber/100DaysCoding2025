package Day036;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nilai: ");
        int nilai1 = in.nextInt();
        System.out.print("Masukkan nilai: ");
        int nilai2 = in.nextInt();
        
        System.out.println("\n=====Pilih Operator Arotmatika=====");
        System.out.println("1. Perkalian");
        System.out.println("2. pembagian");
        System.out.print("Masukkan pilihan: ");
        int ab = in.nextInt();
        int ac;
        if (ab == 1) {
            System.out.println("\n====Perkalian====");
            System.out.println("1. nilai1 * nilai2");
            System.out.println("2. nilai2 * nilai1");
            System.out.print("Masukkan pilihan: ");
            ac = in.nextInt();
            if (ac == 1) {
                int kali = nilai1 * nilai2;
                System.out.printf("Nilai1 %d * Nilai2 %d = %d %n",nilai1, nilai2, kali );
            }else if (ac == 2) {
                int kali = nilai2 * nilai1;
                System.out.printf("Nilai2 %d * Nilai1 %d = %d %n",nilai2, nilai1, kali );
            }else{
                System.out.println("Pilihannya hanya 1 dan 2");
            }
            
        }else if (ab == 2) {
            System.out.println("\n====Pembagian====");
            System.out.println("1. nilai1 / nilai2");
            System.out.println("2. nilai1 % nilai2");
            System.out.print("Masukkan pilihan: ");
            ac = in.nextInt();
            if (ac == 1) {
                double bagi = nilai1 / nilai2;
                System.out.printf("Nilai1: %d / Nilai2: %d = %.1f %n",nilai1, nilai2, bagi );
            }else if (ac == 2) {
                double bagi = nilai1 % nilai2;
                System.out.printf("Nilai2: %d / Nilai1: %d = %.1f %n",nilai2, nilai1, bagi );
            }else{
                System.out.println("Pilihannya hanya 1 dan 2");
            }
        }else{
            System.out.println("Tidak ada dalam daftar pilihan");
        }
    }
}
