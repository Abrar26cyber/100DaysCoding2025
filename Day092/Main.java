package Day092;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        double y = in.nextDouble();
        System.out.print("Masukkan lebar: ");
        double c = in.nextDouble();
        
        double total = persegi(y, c);
        System.out.printf("Luas Persegi dengan panjang %.0f dan lebar %.0f adalah: %.1f cm%n", y, c, total);
    }
    static double persegi (double a, double b){
        return a * b;
    }
}
