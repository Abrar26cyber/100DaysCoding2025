package Day058;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Angka N: ");
        int n = in.nextInt();
        System.out.println("===== 1 - N =====");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");

        }
        System.out.println("\n===== N-1 =====");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        in.nextLine();
    }
}
