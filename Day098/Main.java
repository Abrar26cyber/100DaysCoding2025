package Day098;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka (angka !< 0): ");
        int angka = in.nextInt();
        System.out.println("\n= Deretan Fibonaccy =");
        naccy(angka);
        System.out.println();
    }

    static void naccy(int y) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < y; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

}
