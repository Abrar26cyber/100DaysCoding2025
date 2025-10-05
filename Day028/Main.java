package Day028;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan angka: ");
        int ab = in.nextInt();
        System.out.print("Masukkan angka: ");
        int ac = in.nextInt();
        
        boolean abc = ab == ac;
        System.out.println("Apakah nilai dari 2 variabel sama:");
        
        if (ab == ac) {
            System.out.println("Nilai 1:" +ab+ " dan Nilai 2:" +ac+ "\nMaka hasilnnya adalah: " + abc);
        }else if (ab != ac){
            System.out.println("Nilai 1:" +ab+ " dan Nilai 2:" +ac+ "\nMaka hasilnnya adalah: " + abc);
        }
    }
}
