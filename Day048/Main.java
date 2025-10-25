package Day048;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("============= KALKULATOR ==============");
        System.out.println("a. Penjumlahan");
        System.out.println("b. Pengurangan");
        System.out.println("c. Perkalian");
        System.out.println("d. Pembagian");
        System.out.print("Masukkan pilihan: ");
        char ab = in.next().charAt(0);

        int a;
        int b;
        double hasil;

        switch (ab) {
            case 'a':
                System.out.println("\n===== PENJUMLAHAN ======");
                System.out.print("Masukkan angka 1: ");
                a = in.nextInt();
                System.out.print("Masukkan angka 2: ");
                b = in.nextInt();
                hasil = a + b;
                System.out.printf("%d + %d = %.0f %n", a, b, hasil);
                break;
            case 'b':
                System.out.println("\n===== PENGURANGAN ======");
                System.out.print("Masukkan angka 1: ");
                a = in.nextInt();
                System.out.print("Masukkan angka 2: ");
                b = in.nextInt();
                hasil = a - b;
                System.out.printf("%d - %d = %.0f %n", a, b, hasil);
                break;
            case 'c':
                System.out.println("\n===== PERKALIAN ======");
                System.out.print("Masukkan angka 1: ");
                a = in.nextInt();
                System.out.print("Masukkan angka 2: ");
                b = in.nextInt();
                hasil = a * b;
                System.out.printf("%d * %d = %.0f %n", a, b, hasil);
                break;
            case 'd':
                System.out.println("\n===== PEMBAGIAN ======");
                System.out.print("Masukkan angka 1: ");
                double c = in.nextInt();
                System.out.print("Masukkan angka 2: ");
                double d = in.nextInt();
                if (c <= 0 || d <= 0) {
                    System.out.println("Angka tidak boleh 0");
                } else {
                    hasil = c / d;
                    System.out.printf("%.0f / %.0f = %.2f %n", c, d, hasil);
                    break;
                }
            default:
                System.out.println("Pilihlah dari a-d dalam huruf kecil");
        }
    }
}
