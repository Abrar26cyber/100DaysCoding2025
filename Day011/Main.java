package Day011;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //penggunaan/pemanggilan Scanner
        Scanner abrar = new Scanner (System.in);
        
        System.out.print("Masukkan Nama \t\t :");
        String nama = abrar.nextLine();
        
        System.out.print("Masukkan alamat\t\t :");
        String alamat = abrar.nextLine();
        
        System.out.print("Masukkan Umur \t\t :");
        int umur = abrar.nextInt();
        
        System.out.print("Masukkan berat badan \t :");
        double bb = abrar.nextDouble();
        
        System.out.print("Masukkan tinggi badan\t :");
        float tb = abrar.nextFloat();
        
        System.out.println("Halo " + nama + " Apa kabar");
        System.out.println("kamu tinggal di " + alamat);
        System.out.println("saat ini kamu berumur " + umur + " tahun");
        System.out.println("Kamu memilki berat badan:" + bb);
        System.out.println("Dengan dengan tinggi badan:" + tb);
        
    }
    
}
