package Day055_Evaluasi;

import java.util.Scanner;

public class Soal_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nilai: ");
        int nilai = in.nextInt();
        
        String hasil = (nilai > 70)? "Ujian kroco ji pale":"Sa jappo'ka Aih";
          System.out.println(hasil);  
        
    }
}
