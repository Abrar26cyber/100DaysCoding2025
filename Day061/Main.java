package Day061;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka M: ");
        int m = in.nextInt();
        System.out.print("Masukkan angka N: ");
        int n = in.nextInt();
        
        int b = 1;
        String d = "";
        while(b <= n){
            if (b %m == 0) {
                d += b + " ";
            }
            b ++;
        }
        System.out.println("---------------------------------");
        System.out.printf("Kelipatan %d adalah: %s%n", m, d);
        in.close();
    }

}
