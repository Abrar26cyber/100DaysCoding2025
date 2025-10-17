package Day040;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int angka = in.nextInt();
        char k = in.next().charAt(0);
        int angka1 = in.nextInt();
        
        int hasil;
        if (k == '+') {
            hasil = angka + angka1;
            System.out.printf("%n%d + %d = %d%n", angka, angka1, hasil);
        }else if (k == '*') {
            hasil = angka * angka1;
            System.out.printf("%n%d * %d = %d%n", angka, angka1, hasil);
        }else if (k == '-') {
            hasil = angka - angka1;
            System.out.printf("%n%d - %d = %d%n", angka, angka1, hasil);
        }else if (k == '/') {
            hasil = angka / angka1;
            System.out.printf("&n%d / %d = %d%n", angka, angka1, hasil);
        } 
    }
}
