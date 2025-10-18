package Day041_Evaluasi;

import java.util.Scanner;

public class Main_soal_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan nama siswa: ");
        String nama = in.nextLine();
        System.out.print("Masukkan nilai siswa: ");
        int nilai = in.nextInt();
        
        System.out.print("Siswa: " +nama);
        
        if (nilai >= 90) {
            System.out.println(" Sangat baik");
        }else if (nilai >= 75) {
            System.out.println(" Baik");
        }else if (nilai >= 60) {
            System.out.println(" cukup");
        }else if (nilai < 60) {
            System.out.println(" Tidak lulus");
        }
        if (nilai %2 == 0) {
            System.out.println("Nilai genap");
        }else{
            System.out.println("Nilai ganjil");
        }
    }

}
