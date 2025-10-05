package Day027_Evaluasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        
        //Tugas satu
        int P = masuk.nextInt();
        int L = masuk.nextInt();
        
        int luas = P * L;
        
        System.out.println(luas /(2 * 2));
        
        //Tugas 2
        
        int a = masuk.nextInt();
        int b = masuk.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
