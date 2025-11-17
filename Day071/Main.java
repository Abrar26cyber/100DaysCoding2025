package Day071;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (;;) {
            System.out.print("Masukkan batas\t\t: ");
            int batas = in.nextInt();
            if (batas < 0) {
                System.out.println("Anda telah memasukkan bilangan untuk berhenti!!");
                break;
            }
            System.out.print("Masukkan karakter\t: ");
            char kart = in.next().charAt(0);

            for (int i = 0; i <= batas; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(kart + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
