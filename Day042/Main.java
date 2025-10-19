package Day042;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan nama: ");
        String nama = in.nextLine();
        System.out.print("Masukkan Penghasilan: ");
        int hasil = in.nextInt();
        System.out.print("Masukkan lama lembur: ");
        int jam = in.nextInt();
        System.out.println("==================================");
        
        int lembur = 50000 * jam;
        double pajak;
        double bersih;
        
        if (hasil >= 6000000) {
            pajak = 0.16 * hasil;
            bersih = (hasil + lembur) - pajak;
            System.out.println("Nama karyawan\t: " +nama);
            System.out.println("pajak dikenakan\t: 16%");
            System.out.println("Gaji lembur\t: Rp" +lembur);
            System.out.println("Gaji bersih\t: Rp " +bersih);
        }else if (hasil >= 3000000 && hasil < 6000000) {
            pajak = 0.08 * hasil;
            bersih = (hasil + lembur) - pajak;
            System.out.println("Nama karyawan\t: " +nama);
            System.out.println("pajak dikenakan\t: 8%");
            System.out.println("Gaji lembur\t: Rp" +lembur);
            System.out.println("Gaji bersih\t: Rp " +bersih);
        }else {
            bersih = (hasil + lembur);
            System.out.println("Nama karyawan\t: Rp " +nama);
            System.out.println("pajak dikenakan\t: 0%");
            System.out.println("Gaji lembur\t: Rp" +lembur);
            System.out.println("Gaji bersih\t: Rp " +bersih);
        }
    }
}
