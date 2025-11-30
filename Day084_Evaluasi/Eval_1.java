package Day084_Evaluasi;

import java.util.Scanner;

public class Eval_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int n = in.nextInt();
        System.out.println();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+ " * " +n + " = " +(i*n));
        }
    }
}
