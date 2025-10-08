package Day031;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner masuk = new Scanner (System.in);
         
         System.out.print("Masukkan angka");
         int ab = masuk.nextInt();
         
         boolean if_1 = ab > 0 && ab < 9; 
         boolean if_2 = ab >= 10 && ab < 99 ; 
         boolean if_3 = ab >= 100 && ab < 999 ; 
         
         System.out.println("Bilangan Satuan\t: " + if_1);
         System.out.println("Bilangan puluhan\t: " + if_2);
         System.out.println("Bilangan Ratusan\t: " + if_3);
    }
}
