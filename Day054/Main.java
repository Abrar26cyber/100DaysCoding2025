package Day054;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan batas: ");
        int b = in.nextInt();
        System.out.println("-----------------------------");
        int a = 0;

        while ((a + 1) <= b) {
            a++;
            if (a %3 != 0) {
                continue;
            }
            System.out.println(a + "\t\t Kelipatan 3");
        }
        in.close();
    }
}
