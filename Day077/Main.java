package Day077;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat(>15 karakter)\t: ");
        String kalimat = in.nextLine();
        System.out.println("kata yang ingin diganti: ");
        String lama = in.nextLine();
        System.out.println("Diganti menjadi\t: ");
        String baru = in.nextLine();
        
        String trim = kalimat.trim();
        System.out.println("=============================================");
        System.out.println("Kalimat asli\t: " +kalimat);
        System.out.println("Teks trim\t: " +trim);
        System.out.println("Teks Substring\t: " +(trim.substring(2, 15)));
        System.out.println("Teks replace\t: " + trim.replace(lama, baru));
    }

}
