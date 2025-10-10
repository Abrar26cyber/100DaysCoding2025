package Day033;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int ad = in.nextInt();
        System.out.print("Masukkan angka : ");
        int ac = in.nextInt();
        
        System.out.printf("Apakah %d sama dengan %d : %b \n",ad,ac , (ad == ac));
        System.out.printf("Apakah %d tidak sama dengan %d : %b \n",ad,ac , (ad != ac));
    }
}
