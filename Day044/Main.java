package Day044;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama Mahasiswa: ");
        String nama = in.nextLine();
        System.out.print("Masukkan nilai : ");
        int N = in.nextInt();

        System.out.println("\n===== PREDIKAT NILAI =====");
        String nilai;

        if (N >= 95) {
            nilai = "A";
        } else if (N >= 80) {
            nilai = "B";
        } else if (N >= 75) {
            nilai = "C";
        } else if (N >= 60) {
            nilai = "D";
        } else {
            nilai = "E";
        }
        System.out.println("Nama\t\t: " +nama);
        System.out.println("Nilai\t\t: " +N);
        System.out.printf("Mahasiswa atas nama %s mendapatkaan predikat %s %n", nama, nilai);
    }
}
