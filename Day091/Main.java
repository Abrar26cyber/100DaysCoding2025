package Day091;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int n = in.nextInt();
        segitiga(n);
    }

    static void segitiga(int y) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < y - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
