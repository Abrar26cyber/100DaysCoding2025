package Day046;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;

        System.out.println("============ DAFTAR MENU MAKANAN ===========\n");
        System.out.println("1. Mie ayam");
        System.out.println("2. Mie bakso");
        System.out.println("3. Bakso spesial");
        System.out.println("4. Nasi goreng Amerika");
        System.out.println("5. Ayam bakar");
        System.out.print("Silahkan pilih dengan memasukkan angka 1-5: ");
        pilih = in.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("\nAnda memilih mie ayam \nHarga = 16.000");
                break;
            case 2:
                System.out.println("\nAnda memilih mie bakso \nHarga = 15.000");
                break;
            case 3:
                System.out.println("\nAnda memilih bakso spesial \nHarga = 18.000");
                break;
            case 4:
                System.out.println("\nAnda memilih nasi goreng amerika \nHarga = 17.000");
                break;
            case 5:
                System.out.println("\nAnda memilih ayam bakar \nHarga = 17.000");
                break;
            default:
                System.out.println("\nMaaf yang anda masukkan diluar pilihan yang tersedia");
                break;
        }
        in.close();
    }
}
