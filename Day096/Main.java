package Day096;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka a: ");
        int a = in.nextInt();
        System.out.print("Masukkan angka b: ");
        int b = in.nextInt();
        System.out.println("\n============= PILIHAN ================");
        System.out.println("1. Dijumlah");
        System.out.println("2. Dikurang");
        System.out.println("3. Dikali");
        System.out.println("4. Dibagi");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilih = in.nextInt();

        double temp;
        switch (pilih) {
            case 1:
                System.out.println("\nHasil jumlah");
                temp = tambah(a, b);
                System.out.printf("%d + %d = %.0f %n", a, b, temp);
                break;
            case 2:
                System.out.println("\nHasil Kurang");
                temp = kurang(a, b);
                System.out.printf("%d - %d = %.0f %n", a, b, temp);
                break;
            case 3:
                System.out.println("\nHasil Kali");
                temp = kali(a, b);
                System.out.printf("%d x %d = %.0f %n", a, b, temp);
                break;
            case 4:
                System.out.println("\nHasil Bagi");
                double d = (double) a;
                double p = (double) b;
                temp = bagi(d, p);
                double x = Math.round(temp);
                System.out.printf("%d / %d = %.0f %n", a, b, x);
                break;

        }
    }

    static int tambah(int a, int b) {
        return a + b;
    }

    static int kurang(int a, int b) {
        return a - b;
    }

    static int kali(int a, int b) {
        return a * b;
    }

    static double bagi(double a, double b) {
        return a / b;
    }

}
