package Day053;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan batas: ");
        int b = in.nextInt();
        
        for (int i = 1; i <= b; i++) {
            System.out.println(i);
            if (i == 8) {
                break;
            }
        }
    }
}
