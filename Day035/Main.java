package Day035;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = in.nextLine();
        
        System.out.print("Masukkan nilai rata-rata: ");
        double nilai = in.nextDouble();
        
        if (nilai > 91) {
            System.out.println("Ipk 4,0");
        }else if (nilai > 85 && nilai < 91) {
            System.out.println(" Ipk 3,5");
        }else if (nilai > 78 && nilai < 85) {
            System.out.println("Ipk 3,0");
        }else if (nilai <= 72) {
            System.out.println("Ipk 2,0");
        }
        if (nilai >= 78) {
            System.out.println("Besiswa dilanjutkan ");
        }else{
            System.out.println("Beasiswa dicabut");
        }
    }
}
