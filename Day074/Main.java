package Day074;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        String pesan = "";
        String pesanM = "";
        int tem = 0;
        int temp = 0;

        do {
            System.out.println("\n========= MENU UTAMA =========");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Berhenti memesan");
            System.out.print("Masukkan pilihan (angka): ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("-------- MENU MAKANAN ---------");
                    System.out.println("1. Nasi goreng = 13.000");
                    System.out.println("2. Mie ayam    = 18.000");
                    System.out.println("3. Bakso       = 15.000");
                    System.out.print("Masukkan pilihan (angka): ");
                    int y = in.nextInt();
                    switch (y) {
                        case 1:
                            pesan += "Nasi goroeng\n";
                            tem += 13000;
                            break;
                        case 2:
                            pesan += "Mie ayam\n";
                            tem += 18000;
                            break;
                        case 3:
                            pesan += "Bakso\n";
                            tem += 15000;
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("---------- MENU MINUMAN ---------");
                    System.out.println("1. Es teh      = 5.000");
                    System.out.println("2. jus buah    = 8.000");
                    System.out.println("3. pop ice     = 6.000");
                    System.out.print("Masukkan pilihan (angka): ");
                    int c = in.nextInt();
                    switch (c) {
                        case 1:
                            pesanM += "Es teh\n";
                            temp += 5000;
                            break;
                        case 2:
                            pesanM += "jus buah\n";
                            temp += 8000;
                            break;
                        case 3:
                            pesanM += "pop ice\n";
                            temp += 6000;
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("++++++++++++++++++++++++++++++++++++");
                    System.out.println("Terima kasih telah memesan");
                    System.out.println("____________________________________");
                    System.out.println("Berikut detail pesanan Anda:\n");
                    System.out.println("Makanan:\n" +pesan);
                    System.out.println("Minuman:\n" +pesanM);
                    System.out.println("Total pesanan anda: " + (tem + temp));
                    break;
            }
        } while (pilih != 3);
    }

}
