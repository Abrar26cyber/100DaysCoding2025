package Day069_Evaluasi;

import java.util.Scanner;

public class Main_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalV = 0;
        int jumlahV = 0;
        int jumlahTV = 0;
        int NilaiTl = 100;
        int NilaiTr = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan nilai mahasiswa: ");
            int n = in.nextInt();

            if (n >= 0 && n <= 100) {
                jumlahV++;
                totalV += n;
                if (n < NilaiTl) {
                    NilaiTl = n;
                }else if (n > NilaiTr) {
                    NilaiTr = n;
                }
            }else{
                jumlahTV++;
            }
        }
        double k = ((double)totalV / (double)jumlahV);
        System.out.println();
        System.out.println("Total nilai valid\t: " + totalV);
        System.out.println("Jumlah nilai valid\t: " + jumlahV);
        System.out.println("Jumlah nilai Tidak valid\t: " + jumlahTV);
        System.out.println("Nilai valid terkecil\t: " + NilaiTl);
        System.out.println("Nilai valid terbesar\t: " + NilaiTr);
        System.out.println("Rata-rata nilai valid\t: " + k);
    }

}
