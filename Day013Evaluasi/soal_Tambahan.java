package Day013Evaluasi;
import java.util.Scanner;
public class soal_Tambahan {
    public static void main(String[] args) {
        Scanner ab = new Scanner (System.in);
        //constanta(final)
        System.out.print("Masukkan Nama \t\t :");
        final String nama = ab.nextLine();
        
        System.out.print("Masukkan Nim \t\t :");
        final String nim = ab.nextLine();
        
        System.out.print("Masukkan umur \t\t :");
        final int umur = ab.nextInt();
        
        System.out.print("Masukkan berat badan \t :");
        final double bb = ab.nextDouble();
        
        System.out.print("Masukkan tinggi badan \t :");
        final float tb = ab.nextFloat();
        
        System.out.println();
        
        System.out.println("Halo \nPerkenalkan nama saya " + nama);
        System.out.println("Dengan Nim : " + nim);
        System.out.println("Dan saat ini berumur " + umur);
        System.out.println("Saya memiliki berat badan " + bb);
        System.out.println("Dan tinggi badan " + tb);
        
    }
    
}
