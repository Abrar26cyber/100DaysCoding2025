package Day045;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===== PENENTUAN HARI KERJA =====\n");
        System.out.println("**Pilih hari dari senin - ahad**");
        System.out.print("Masukkan hari: ");
        String hari = in.nextLine();

        switch (hari) {
            case "senin":
            case "selasa":
            case "rabu":
            case "kamis":
            case "jumat":
                System.out.println(hari + " adalah hari kerja");
                break;
            case "sabtu":
            case "ahad":
                System.out.println(hari + " adalah hari libur");
                break;
            default:
                System.out.println("Hari tidak valid atau menggunakan huruf kapital diawal");
        }
    }
}
