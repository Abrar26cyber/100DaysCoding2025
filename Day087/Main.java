package Day087;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] buah = {"Apel", "Mangga", "Pisang", "Jeruk", "Anggur", "Nanas", "Manggis", "Ceri"};
        System.out.println("================================================================");
        System.out.print("Masukkan buah yang ingin dicari: ");
        String ab = in.nextLine();
        String temp = "Buah " + ab + " tidak terdaftar";
        for (int i = 0; i < buah.length; i++) {

            if (ab.equalsIgnoreCase(buah[i])) {
                temp = "Buah " + buah[i] + " berada di rak ke " + i;
            }
        }
        System.out.println(temp);
        System.out.println("================================================================");
    }
}
