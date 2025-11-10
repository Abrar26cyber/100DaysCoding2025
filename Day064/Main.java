package Day064;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Angka: ");
        int m = in.nextInt();
        System.out.print("Masukkan Pangkat: ");
        int n = in.nextInt();
        System.out.println("===================================");
        int ab = 1;
        int ac = 1;
         System.out.println(m + " Pangkat " +n);
        while (ab <= n){
            System.out.print(m + " * ");
            ac *= m;
            ab++;
        }
        System.out.println("\b\b = " +ac);
        in.close();
    }
}
