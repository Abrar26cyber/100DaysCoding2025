package Day038;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        
        int b = 10;
        
        int kurang = angka - b;
        System.out.println("Hasil pengurangan: " + kurang);
        if (kurang > 0) {
            System.out.println("Hasil penngurangan tersebut adalah bilangan positif");
        }else if (kurang == 0) {
            System.out.println("Hasil pengurangan adalah Nol atau netral");
        }else{
            System.out.println("Hasil pengurangan tersebut adalah bilangan negatif");
        }
    }
}
