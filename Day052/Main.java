package Day052;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan batas: ");
        int b = in.nextInt();
        int a = 1;
        int c = 0;
        while (a <= b){
            System.out.print(a+ " + " );
            c += a;
            a++;
        }
        System.out.println("\b\b = " +c);
    }
}
