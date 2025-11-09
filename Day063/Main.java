package Day063;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("======= Perkalian 1 sampai N ======");
        System.out.print("Masukkan batas N: ");
        int n = in.nextInt();
        System.out.println("===================================");
        
        int y = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+ " * ");
            y *= i;
        }
        System.out.println("\b\b = "+y);
        in.close();
    }

}
