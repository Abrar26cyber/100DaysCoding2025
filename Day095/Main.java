package Day095;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        
        if (angka > 0) {
            judul(angka);
            fibunacci(angka);
            System.out.println();
        }else{
            System.out.println("Angka tidak boleh lebih keci atau sama dengan 0");
        }
    }
    static void judul(int y){
        System.out.printf("============== Deretan Fibonacci dengan batas %d ===============%n", y);
    }
    static void fibunacci (int batas){
        int a = 0;
        int b = 1;
        for (int i = 0; i < batas; i++) {
            System.out.print(a+ " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
