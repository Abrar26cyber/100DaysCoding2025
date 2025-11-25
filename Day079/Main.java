package Day079;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ab = new Random();

        System.out.println("====== Anda belum memiliki akun, silahkan buat akun terlebih dahulu ======\n");
        System.out.print("Masukkan Username anda: ");
        String user = in.nextLine();
        System.out.print("Masukkan pasword: ");
        String pw = in.nextLine();
        String userFinal = "";

        //rekomendasi dari sistem
        String sec1 = user + ab.nextInt(100);
        String sec2 = "user_" + ab.nextInt(1000);
        String sec3 = "@" + (char) (ab.nextInt(26) + 65) + "_" + user;

        System.out.println("\n======== Rekomendasi Username =======");
        System.out.println("1. " + sec1);
        System.out.println("2. " + sec2);
        System.out.println("3. " + sec3);
        System.out.println("4. Buat sendiri");

        System.out.print("Pilih (1,2,3,4): ");
        int pilih = in.nextInt();
        in.nextLine();

        if (pilih == 1) {
            userFinal += sec1;
        } else if (pilih == 2) { 
            userFinal += sec2;
        } else if (pilih == 3) {
            userFinal += sec3;
        } else if (pilih == 4) {
            System.out.print("\nMasukkan Username: ");
            String ing= in.nextLine();
            userFinal += ing;
        }
        System.out.println("\n-------Akun anda berhasil dibuat------");
        System.out.println("Nickname: " + userFinal);
        System.out.println("pasword : " + pw);

        System.out.println("\n----------------------------------------------------------");
        System.out.print("Apakah anda ingin mengubah nick name anda (iya/tidak): ");
        String kl = in.nextLine();
        if (kl.equals("iya")) {
            System.out.println("Username anda saat ini: " + userFinal);
            System.out.print("\nMasukkan nama/karakter yang ingin diganti: ");
            String a = in.nextLine();
            System.out.print("Masukkan nama/karakter pengganti: ");
            String b = in.nextLine();
            String h = userFinal.replace(a, b);
            System.out.println("\nUsername Anda : " + h);
            userFinal = h;
        } else if (kl.equals("tidak")) {
            System.out.println("Baik!!");
        }
        System.out.println("\n----------------------------------------------------------");
        System.out.print("Apakah anda ingin mengubah pasword Anda (iya/tidak): ");
        String kc = in.nextLine();
        if (kc.equals("iya")) {
            System.out.println("Pasword anda saat ini: " + pw);
            System.out.print("\nMasukkan pasword terbaru anda: ");
            String v = in.nextLine();
            String z = pw.replace(pw, v);
            System.out.println("\nPasword Anda : " + z);
            pw = z;
        } else if (kc.equals("tidak")) {
            System.out.println("Baik!!");
        }
        System.out.println("\n-------Akun anda berhasil dibuat------");
        System.out.println("Nickname: " + userFinal);
        System.out.println("pasword : " + pw);

        System.out.println("\nSilahkan Login kembali dengan Akun yang telah dibuat\n");
        String nama;
        String sandi;
        do {
            System.out.print("Masukkan username :");
            nama = in.nextLine();
            System.out.print("Masukkan pasword :");
            sandi = in.nextLine();

            if (!nama.equals(userFinal) || !sandi.equals(pw)) {
                System.out.println("\nPasword/username anda salah silahkkan coba lagi!!");
            }

        } while (!nama.equals(userFinal) || !sandi.equals(pw));
        System.out.println("\n###########################################################");
        System.out.println("Anda berhasil Login\nSelamat datang " +userFinal + "!!");
    }

}
