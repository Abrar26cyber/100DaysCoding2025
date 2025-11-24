package Day078;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nMasukkan Kalimat: ");
        String kalimat = in.nextLine();
        for (;;) {
            System.out.println("\n==================== PILIHAN ====================");
            System.out.println("a. mengubah dan menghitung karakter");
            System.out.println("b. menampilkan,menggganti, dan mencari kata");
            System.out.println("c. berhenti");
            System.out.print("Masukkan pilihan: ");
            String pilihan = in.nextLine();

            String n = kalimat.trim();

            if (pilihan.equals("a")) {
                System.out.println("\na. huruf kecil");
                System.out.println("b. huruf besar");
                System.out.println("c. menghitung karakter");
                System.out.print("Masukkan piliihan (a-c): ");
                String pilih = in.nextLine();
                System.out.println("---------------------------------------------------");
                switch (pilih) {
                    case "a":
                        System.out.println("Huruf kecil: " + (n.toLowerCase()));
                        break;
                    case "b":
                        System.out.println("Huruf besar: " + (n.toUpperCase()));
                        break;
                    case "c":
                        System.out.println("Jumlah karakter: " + (n.length()));
                        break;
                }
            } else if (pilihan.equals("b")) {
                System.out.println("\na. Menampilkan kata dari index 0 - 6");
                System.out.println("b. mengganti sebuah kata");
                System.out.println("c. menganalisis suatu kata");
                System.out.print("Masukkan piliihan (a-c): ");
                String pilih = in.nextLine();
                System.out.println("---------------------------------------------------");
                switch (pilih) {
                    case "a":
                        System.out.println("\nKarakter dari index 0 - 6: " + (n.substring(0, 6)));
                        break;
                    case "b":
                        System.out.println("Kalimat inputan" +n);
                        System.out.print("Masukkan kata yang ingin diganti: ");
                        String a = in.nextLine();
                        System.out.print("Masukkan kata pengganti: ");
                        String b = in.nextLine();
                        System.out.println("_______________________________________________");
                        System.out.println("\nKalimat terbaru: " +(n.replace(a, b)));
                        break;
                    case "c":
                        System.out.print("Masukkan kata yanng ingin dicari: ");
                        String y = in.nextLine();
                        if (y.contains(y)) {
                            System.out.printf("Kalimat tersebut mengandung kata %s %n", y);
                        }else{
                            System.out.println("Kata tidak terdapat dalam kalimat");
                        }
                        break;
                }
            }else  if (pilihan.equals("c")) {
                System.out.println("\nProgram telah berhenti!!");
                break;
            }
        }
        in.close();
    }

}
