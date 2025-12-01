package Day085;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int [] nilai = new int [5];
        
        System.out.print("Masukkan nilai: ");
        for (int i = 0; i < 5; i++) {
            nilai [i] = in.nextInt();
        }
        int a = nilai[0];

        for (int i = 0; i < 5; i++) {
            if (nilai[i] > a) {
                a = nilai[i];
            }
        }
        System.out.println("\nAngka maks/terbesar: " +a);
    }

}
