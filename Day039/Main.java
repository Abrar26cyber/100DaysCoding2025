package Day039;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int b , c;
        
        System.out.println("======List Menu======");
        System.out.println("1. Makanan berat");
        System.out.println("2. Minuman");
        System.out.println("3. cemilan");
        System.out.print("Masukkan pilihan: ");
        b = in.nextInt();
        
        if (b == 1) {
            System.out.println("\n1. Nasi goreng");
            System.out.println("2. Mie ayam");
            System.out.println("3. Bakso");
            System.out.print("Masukkan pilihan: ");
            c = in.nextInt();
            if (c == 1) {
                System.out.println("\n====Pesanan detail===");
                System.out.println("Nasi goreng telur = 15.000");
                System.out.println("Nasi goreng komplit = 18.000");
            }else if (c == 2) {
                System.out.println("\n====Pesanan detail===");
                System.out.println("Mie ayam Biasa = 15.000");
                System.out.println("Mie ayam pake telur = 18.000");  
            }else if (c == 3) {
                System.out.println("\n====Pesanan detail===");
                System.out.println("Bakso Indomie = 15.000");
                System.out.println("Bakso spesial = 18.000");  
            }else{
                System.out.println("Stok tidakk tersedia");
            }
        }else if (b == 2) {
            System.out.println("\n1. Minuman dingin");
            System.out.println("2. Minuman hangat");
            System.out.print("Masukkan pilihan: ");
            c = in.nextInt();
            if (c == 1) {
                System.out.println("\n====Detail Pesanan====");
                System.out.println("Jus buah alami = 10.000");
                System.out.println("pop ice = 8.000");
            }else if (c == 2) {
                System.out.println("\n====Detail pesanan====");
                System.out.println("Kopi susu = 5.000");
                System.out.println("Americano = 7.000");
            }else{
                System.out.println("Minuman tidak tersedia");
            }
        }else if (b == 3) {
            System.out.println("\n1. kentang");
            System.out.println("2. Gorengan");
            System.out.print("Masukkan pilihan: ");
            c = in.nextInt();
            if (c == 1) {
                System.out.println("\n====Detail pesanan====");
                System.out.println("Kentang Bumbu Balado = 10.000");
                System.out.println("kentang dengan sambal/saos = 10.000" );
            }else if (c == 2) {
                System.out.println("\n====Detail pesanan====");
                System.out.println("Bakwan = 1.000");
                System.out.println("Tahu = 1.000");
                System.out.println("Tempe = 1.000");
            }else{
                System.out.println("Silahkan cari ditampat lain");
            }
        }else{
            System.out.println("Pilih menu yang tertera");
        }
    }
}
    

