package Day060;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan batas N: ");
        int n = in.nextInt();
        String j = "";
        String p = "";
        for (int i = n; i >= 1; i--) {
            if (i %2 != 0) {
               j += i+ " "; 
            }else {
                p += i+ " ";
            }
        }
        System.out.println("\n==Mecetak angka ganjil dan genap dari N-1===");
        System.out.printf("Angka ganjil: %n%s %n",j);
        System.out.printf("Angka genap: %n%s %n",p);
    }
}
