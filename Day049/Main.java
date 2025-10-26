package Day049;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int ab = in.nextInt();
        System.out.print("Masukkan angka: ");
        int ac = in.nextInt();

        int h = ab * ac;
        System.out.println("Hasil perkalian: " + h);

        String hasil;
        hasil = (h > 1 && h < 10) ? "Hasil merupakan bilngan satuan"
                : (h >= 10 && h <= 19) ? "Hasil merupakan bilangan belasan"
                        : (h >= 20 && h < 100) ? "Hasil merupakan bilangan puluhan"
                                : (h >= 100 && h < 1000) ? "Hasil merupakan bilangan ratusan"
                                        : "Hasil lebih dari ratusan";
        System.out.println(hasil);
    }
}
