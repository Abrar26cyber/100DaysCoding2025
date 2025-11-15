package Day069_Evaluasi;

import java.util.Scanner;

public class Main_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int h;
        System.out.println("====== KALKULATOR SEDERHANA ======");
        for (;;) {
           int a = in.nextInt();
           char r = in.next().charAt(0);
           int b = in.nextInt();
           
            if (r == '+') {
                h = a + b;
                System.out.printf("Hasil dari %d + %d adalah %d %n", a, b, h);
            }else if (r == '-') {
                h = a - b;
                System.out.printf("Hasil dari %d - %d adalah %d %n", a, b, h);
            }else if (r == '*') {
                h = a * b;
                System.out.printf("Hasil dari %d x %d adalah %d %n", a, b, h);
            }else if (r == '/') {
                double i = (double)a / (double)b;
                System.out.printf("Hasil dari %d / %d adalah %d %.2f", a, b, i);
            }else if (r == '%') {
                h = a % b;
                System.out.println("Hasil dari " +a+ " % " +b+ " adalah " +h);
            }
        }
    }
}
