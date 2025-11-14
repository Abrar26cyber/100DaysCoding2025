package Day068;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan karakter atau inisial: ");
        String k = in.nextLine();
        
        System.out.println("======= POLA PERSEGI SESUAI KARAKTER INPUTAN ========");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

}
