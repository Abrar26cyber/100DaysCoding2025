package Day099;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int a = in.nextInt();
        
        System.out.println("\n== Deretan bilangan prima ==");
        prima(a);
        System.out.println();
    }
    static void prima (int n){
        for (int i = 2; i <= n; i++) {
            boolean prima = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.print(i+ " "); 
            }
        }
    }
}