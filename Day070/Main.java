package Day070;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Tinggi sisi\t: ");
        int t = in.nextInt();
        System.out.print("Masukkan Lebar sisi\t: ");
        int l = in.nextInt();
        System.out.print("Masukkan 1 karakter\t: ");
        char y = in.next().charAt(0);
        System.out.println("===========================================");
        
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(y + " ");
            }
             System.out.println();
        }
       
    }
}
