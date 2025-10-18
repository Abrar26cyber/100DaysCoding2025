package Day041_Evaluasi;

import java.util.Scanner;

public class Main_soal_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = in.nextLine();
        System.out.print("Masukkan angka dalam bentuk String: ");
        String angka = in.nextLine();
        
        int konversi = Integer.parseInt(angka);
        konversi++;
        konversi--;
        konversi += 9;
        konversi -= 6;
        String konversiL = String.valueOf(konversi);
        
        System.out.println("Nama: "+nama);
        System.out.println("Nilai akhir (int): " +konversi);
        System.out.println("Nilai akhir (String): " +konversiL);
    }
}
