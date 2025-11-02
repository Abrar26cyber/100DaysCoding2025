package Day055_Evaluasi;

import java.util.Scanner;

public class Soal_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Angka: ");
        int a = in.nextInt();
        String nilai = (a % 2 == 0) ? "Iyaji" : "Tidak ji";
        System.out.println(nilai);
    }
}
