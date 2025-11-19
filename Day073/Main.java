package Day073;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--------------- PENJUMLAHAN --------------");
        System.out.println(" note: input angka negatif untuk berhenti \n");
        for (;;) {
            System.out.print("Masukkan angka pertama\t:");
            int a = in.nextInt();
            System.out.print("Masukkan angka kedua\t:");
            int b = in.nextInt();

            if (a < 0 || b < 0) {
                System.out.println("+++++++++++++++++++++++++++++++++++++");
                System.out.println("Terima kasih telah berkontribusi!!");
                break;
            }
            int temp = a + b;
            System.out.printf("%d + %d = %d %n", a, b, temp);
            System.out.println("======================================");
        }
    }
}
