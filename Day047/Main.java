package Day047;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("======== MENENTUKAN HARI KERJA =========\n");
        System.out.print("Masukkan angka 1 -7: ");
        int angka = in.nextInt();
        
        switch (angka){
            case 1:
                System.out.println("\n" +angka+ " adalah Hari senin");
                break;
            case 2:
                System.out.println("\n" +angka+ " adalah Hari selasa");
                break;
            case 3:
                System.out.println("\n" +angka+ " adalah Hari rabu");
                break;
            case 4:
                System.out.println("\n" +angka+ " adalah Hari kamis");
                break;
            case 5:
                System.out.println("\n" +angka+ " adalah Hari jumat");
                break;
            case 6:
                System.out.println("\n" +angka+ " adalah Hari sabtu");
                break;
            case 7:
                System.out.println("\n" +angka+ " adalah Hari ahad");
                break;
            default:
                System.out.println("Angka tidak terdapat dalam inputan yang diminta");
        }
        switch (angka){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dan merupakan hari kerja");
                break;
            case 6:
            case 7:
                System.out.println("Dan merupakan akhir pekan");
                break;
            default:
                System.out.println("Hari tidak terdaftar");
        }
        in.close();
    }
}
