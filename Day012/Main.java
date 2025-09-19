package Day012;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner (System.in);
        System.out.println("Biodata Sederhana");
        
        System.out.print("Masukkan nama \t\t\t : ");
        String nama = ar.nextLine();
        
        System.out.print("Masukkan Universitas\t\t : ");
        String univ = ar.nextLine();
        
        System.out.print("Masukkan fakultas \t\t : ");
        String fakultas = ar.nextLine();
        
        System.out.print("Masukkan prodi \t\t\t : ");
        String prodi = ar.nextLine();
        
        System.out.print("Tempat lahir\t\t\t : ");
        String tl = ar.nextLine();
        
        System.out.print("tanggal lahir\t\t\t : ");
        String ttl = ar.nextLine();
        
        System.out.print("Masukkan Alamat \t\t : ");
        String alamat = ar.nextLine();
        
        System.out.print("Alumni dari \t\t\t : ");
        String alumni = ar.nextLine();
        
        System.out.print("Masukkan status \t\t : ");
        String sta = ar.nextLine();
        
        System.out.print("Masukkan anak ke berapa\t : ");
        String kk = ar.nextLine();
        
        System.out.print("Masukkan status hubungan\t : ");
        String sth = ar.nextLine();
        System.out.println();
        System.out.println("Halo, Perkenalkan nama saya " + nama);
        System.out.println("saya mahasiswa " + univ);
        System.out.println("Dari Fakultas " + fakultas);
        System.out.println("Prodi " + prodi);
        System.out.println("Saya lahir di " + tl + " Pada Tanggal " + ttl);
        System.out.println("Saat ini, saya tinggal di " + alamat + " Kota Majene");
        System.out.println("Saya alumni dari sekolah " + alumni);
        System.out.println("Dan berstatus sebagai " + sta);
        System.out.println("Saya adalah anak ke " + kk);
        System.out.println("Untuk status hubungan saat ini saya " + sth);
    }
}
