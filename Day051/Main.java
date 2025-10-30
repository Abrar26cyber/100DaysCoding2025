package Day051;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan batas: ");
        int b = in.nextInt();
        
        for (int i = 1; i <= b; i++) {
            System.out.print(i);
            if (i %2 ==0 ) {
                System.out.println(" Angka genap");
            }else{
                System.out.println(" Angka ganjil");
            }
        }
    }
}
