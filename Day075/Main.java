package Day075;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("====== Method Dasar String =====");
        System.out.print("Masukkan teks/ kalimat: ");
        String k = in.nextLine();
        
        int a = k.length();
        String b = k.toUpperCase();
        String c = k.toLowerCase();
        System.out.println();
        System.out.println("1. length(): " + a);
        System.out.println("----------------------------");
        System.out.println("2. toUpperCase(): " + b);
        System.out.println("----------------------------");
        System.out.println("3. toLowerCase(): " + c);
    }

}
