package Day021;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //menukar nilai dari dua variabel
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan Angka variabel angka1 \t : ");
        int angka1 = in.nextInt();
        System.out.print("Masukkan Angka varaibel angka2 \t : ");
        int angka2 = in.nextInt();
        
        angka1 = angka1 + angka2;
        angka2 = angka1 - angka2;
        angka1 = angka1 - angka2;
        
        System.out.println();
        
        System.out.println("Hasil pertukaran variabel angka1 \t : " + angka1);
        System.out.println("Hasil pertukaran variabel angka2 \t : " + angka2);

    }
}
