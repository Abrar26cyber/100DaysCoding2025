package Day076;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=========== Pengecekan Inputan ===========");
        String kunci = "Hari Ini Adalah Hari Yang Indah";
        System.out.println("Kata kunci: " +kunci);
        System.out.print("\nMasukkan Kalimat: ");
        String kata = in.nextLine();
        if (kata.equals(kunci)) {
            System.out.println("\nKalimat yang anda masukkan persis seperti kata kunci");
        }else if (kata.equalsIgnoreCase(kunci)) {
            System.out.println("\nKalimat yang anda masukkan hanya sama dalam kata tidak formatnya");
        }else{
            System.out.println("\nKalimat yang anda masukkan berbeda dari kata kunci");
        }
        if (kata.contains("Hari")) {
            System.out.println("Dan kata 'Hari' terselip di antara kalimat inputan");
        }else{
            System.out.println("Dan kata 'Hari' tidak ada dalam kalimat inputan");
        }
        System.out.print("\nMasukkan nama: ");
        String nama = in.nextLine();
        if (nama.isEmpty()) {
            System.out.println("Error!");
        }else{
            System.out.println("Halo " +nama);
        }

    }
}
