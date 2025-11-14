package Day067;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String kata = in.nextLine();
        
        for (int i = 0; i < kata.length(); i++) {
            System.out.print(kata.charAt(2)+ "  ");
        }
        System.out.println();
    }
}
