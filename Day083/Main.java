package Day083;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int j = in.nextInt();
        System.out.println("==============================================");

        int[] angka = new int[j];
        int temp = 0;

        System.out.println("Masukkan elemen array: ");
        for (int i = 0; i < angka.length; i++) {
            angka[i] = in.nextInt();
            temp += angka[i];
        }
        System.out.println("Total semua elemen array = " +temp);
    }
}
