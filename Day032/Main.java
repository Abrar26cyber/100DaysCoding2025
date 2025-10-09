package Day032;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Apakah kamu memiliki tiket : ");
        boolean tiket = in.nextBoolean();
        System.out.print("Apakah kamu memiliki kaartu VIV : ");
        boolean viv = in.nextBoolean();

        boolean izin = tiket || viv;

        System.out.println("Kamu memenuhi salah satu syarat untuk masuk: " + izin);
    }
}
