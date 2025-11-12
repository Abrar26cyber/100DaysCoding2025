package Day066;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jumlah: ");
        int jumlah = in.nextInt();
        System.out.println("================================================");
        
        String[] A = new String[jumlah];
        String[] B = new String[jumlah];
        for (int i = 0; i < jumlah; i++) {
            A[i] = "o";
        }
        for (int i = 0; i < jumlah; i++) {
            B[i] = "*";
        }
        for (int k = 0; k < jumlah; k++) {
            System.out.println(A[k] + "                   " +B[k]);
        }
        in.close();
    }
}
