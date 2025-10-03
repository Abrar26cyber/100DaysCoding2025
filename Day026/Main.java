package Day026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        
        angka += 2;
        System.out.printf("Value/nilai variabel dijumlahkan 2 \t = %d\n",angka);
        angka -= 2;
        System.out.printf("Value/nilai variabel dikurangi 2 \t = %d\n",angka);
        angka *= 2;
        System.out.printf("Value/nilai variabel dikalikan 2 \t = %d\n",angka);
        angka /= 2;
        System.out.printf("Value/nilai variabel dibagi 2 \t\t = %d\n",angka);
        angka %= 2;
        System.out.printf("Value/nilai variabel sisa bagi dengan 2  = %d\n",angka);
        angka = 2;
        System.out.printf("Value/nilai variabel sama dengan 2 \t = %d\n",angka);
    }
}
