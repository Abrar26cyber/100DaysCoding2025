package Day050;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("========= MENENTUKAN GANJIL GENAP ============\n");
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        System.out.print("Masukkan angka: ");
        int nilai = in.nextInt();
        
        int hasil = (angka * nilai) + 2;
        String akhir = (hasil %2 == 0)? "angka genap":"angka ganjil";
        System.out.println("Hasil = " +hasil);
        System.out.println("Merupakan " +akhir);
    }
}
