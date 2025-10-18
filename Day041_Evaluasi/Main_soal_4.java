package Day041_Evaluasi;

import java.util.Scanner;

public class Main_soal_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan nama Kasir: ");
        String nama = in.nextLine();
        System.out.print("Masukkan harga barang (Rp): ");
        double harga = in.nextDouble();
        
        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Kasir: " +nama);
        System.out.println("Harga barang: Rp " +harga);
        
        double diskon;
        double hasil;
        
        if (harga > 1000000) {
            diskon = harga * 0.20;
            hasil = harga - diskon;
            System.out.println("Diskon (20.0%): Rp " +diskon);
            System.out.println("Total bayar: Rp " +hasil);
        }else if (harga >= 500000) {
            diskon = harga * 0.10;
            hasil = harga - diskon;
            System.out.println("Diskon (10.0%): Rp " +diskon);
            System.out.println("Total bayar: Rp " +hasil);
        }else{
            System.out.println("Total bayar: Rp " +harga);
        }
    }
}
