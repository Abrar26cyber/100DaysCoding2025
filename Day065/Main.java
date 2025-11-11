package Day065;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan Nilai faktorial: ");
        int f = in.nextInt();
        
        int y = 1;
        String h = "";
        for (int i = f; i > 0; i--) {
            h += i + " * ";
            y *= i;
        }
        System.out.print(f+ "! Adel Cantik= " +h);
        System.out.println("\b\b= " +y);
    }

}
