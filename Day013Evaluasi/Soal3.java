package Day013Evaluasi;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        //pemanggilan utilitas Scanner
        Scanner aj = new Scanner (System.in);
        
        System.out.print("Masukkan nama\t :");
        String nama = aj.nextLine();
        
        System.out.print("Masukkan status\t :");
        String status = aj.nextLine();
        
        System.out.print("Masukkan Alamat\t :");
        String alamat = aj.nextLine();
        
        System.out.print("Masukkan umur\t :");
        int umur = aj.nextInt();
        
        System.out.print("Masukkan berat badan\t : ");
        double bb = aj.nextDouble();
        
        System.out.print("Masukkan Tinggi badan\t: ");
        float tb = aj.nextFloat();
        
        System.out.println();
        
        System.out.println("Halo, perkenalkan nama saya " + nama);
        System.out.println("Saya berstatus sebagai  " + status );
        System.out.println("saya tinggal di " + alamat + " Di kota Majene");
        System.out.println("saat ini saya berumur " + umur + "tahun");
        System.out.println("Saya memiliki berat badan " + bb);
        System.out.println("Dan tinggi " + tb);
    }
}
