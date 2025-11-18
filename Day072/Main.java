package Day072;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan batas: ");
        int batas = in.nextInt();
        System.out.print("Masukkan inisial nama/karakter: ");
        char ab = in.next().charAt(0);
        System.out.println("===========================================");
        System.out.println("Segitiga sama kaki terbalik\n");
        for (int i = batas; i >= 0; i--) {
            for (int j = 0; j <= batas - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print(" " +ab);
            }
            System.out.println();
        }
        System.out.println("\nSegitiga siku siku terbalik\n");
        for (int i = batas; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(ab+ " ");
            }
            System.out.println();
        }
    }

}
