package Day043;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int ab = in.nextInt();

        if (ab % 3 == 0 && ab % 5 == 0) {
            System.out.printf("Angka %d meruapakan kelipatan 3 dan 5 %n", ab);
        } else if (ab % 3 == 0) {
            System.out.printf("Angka %d merupakan kelipatan 3 %n", ab);
        } else if (ab % 5 == 0) {
            System.out.printf("Angka %d merupakan kelipatan 5 %n", ab);
        }
    }
}
