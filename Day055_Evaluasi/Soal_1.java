package Day055_Evaluasi;

import java.util.Scanner;

public class Soal_1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Batas bawah: ");
        int a = in.nextInt();
        System.out.print("Batas atas: ");
        int b = in.nextInt();
        System.out.print("Angka: ");
        int c = in.nextInt();
        
        if (a + b > c) {
            System.out.println("YAYAYAYA");
        }else if ( a + b < c) {
            System.out.println("NONONONO");
        }
    }
}
