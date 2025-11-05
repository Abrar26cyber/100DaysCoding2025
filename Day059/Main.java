package Day059;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int n = in.nextInt();

        int a = 1;
        String j = " ";
        String d = " ";
        while (a <= n) {
            if (a % 2 == 0) {
                j += a + " ";
            } else if (a % 2 != 0) {
                d += a + " ";
            }
            a++;
        }
        System.out.println("\n====== Angka ganjil 1-N =======");
        System.out.println(d);
        System.out.println("\n====== Angka genap 1-N =======");
        System.out.println(j);
    }
}
