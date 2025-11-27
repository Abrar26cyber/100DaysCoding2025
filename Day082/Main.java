package Day082;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah hewan: ");
        int jumlah = in.nextInt();
        in.nextLine();
        
        String [] hewan = new String[jumlah];
        String hw = "";
        System.out.println();
        for (int i = 0; i < hewan.length; i++) {
            System.out.print("Masukkan nama hewan ke " +(i+1)+ " :");
            hewan [i] = in.nextLine();
            hw +=  (i+1)+ " " +hewan[i] + "\n";
        }
        System.out.println("\n======= Nama nama hewan =========");
        System.out.println(hw);
    }

}
