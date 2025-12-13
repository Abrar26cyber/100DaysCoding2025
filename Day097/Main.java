
package Day097;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan panjang persegi\t:");
        double p = in.nextDouble();
        System.out.print("Masukkan Luas persegi\t\t:");
        double l = in.nextDouble();
        System.out.println("==============================================");
        if (p == l) {
            double luas = luas(p, l);
            System.out.printf("Luas Persegi = %.1f %n", luas);
        }else{
            double total = luasP(p ,l);
            System.out.printf("Luas Persegi panjang = %.1f %n", total);
        }
    }
    static double luasP (double a, double b){
        return a * b;
    }
    static double luas (double a, double b){
        return a * b;
    }
}
