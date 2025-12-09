package Day093;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka desimal: ");
        double angka = in.nextDouble();
        
        double atas = bulatKeatas(angka);
        double bawah = bulatKebawah(angka);
        double bulat = bulatkan(angka);
        System.out.println("==================================================");
        System.out.printf("%.1f dibulatkan keatas\t= %.0f %n", angka, atas);
        System.out.printf("%.1f dibulatkan kebawah\t= %.0f %n", angka, bawah);
        System.out.printf("%.1f dibulatkan\t\t= %.0f %n", angka, bulat);
    }

    static double bulatKeatas(double y) {
        return Math.ceil(y);
    }

    static double bulatKebawah(double s) {
        return Math.floor(s);
    }

    static double bulatkan(double b) {
        return Math.round(b);
    }

}
