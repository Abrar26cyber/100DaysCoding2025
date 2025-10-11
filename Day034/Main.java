package Day034;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nilai : ");
        int nilai = in.nextInt();
        System.out.print("Masukkan jumlah kehadiran dalam sebulan : ");
        int hadir = in.nextInt();
        
        boolean lulus = nilai >= 75 && hadir >= 26;
        System.out.println("Status naik kelas : " + (lulus? "Anda dinyatakan naik kelas":"Anda dinyatakan tinggal kelas"));
    }
}
