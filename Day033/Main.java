package Day033;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Apakah kamu memiliki sim : ");
        boolean ad = in.nextBoolean();
        boolean ac = !ad;
        
        System.out.println("Apakah kamu layak memiliki sim ? : " +ac );
        System.out.println("Status mengemudi" + (ac ? " Tidak boleh mengemudi" : " Boleh mengemudi"));
    }
}
