package Day056;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double saldo = 0;
        String lanjut;
        
        do{
            System.out.print("Masukkan jumlah uang yang ditabung hari ini: ");
            double uang = in.nextInt();
            saldo += uang;
            System.out.printf("Saldo anda saat ini: %.1f %n", saldo);
            
            System.out.print("Apakah anda ingin menabung lagi? (ya/tidak): ");
            lanjut = in.next();
            
        }while(lanjut.equalsIgnoreCase("ya"));
        
        System.out.printf("\nTotal tabungan anda: %.1f %n", saldo);
        System.out.println("Terima kasih telah menabung!!");
    }

}