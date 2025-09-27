package Day020;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //mengubahh tipe data String ke tipe data primitif
        Scanner masuk = new Scanner (System.in);
        System.out.print("Masukkan input ke 1 \t : ");
        String str = masuk.nextLine();
        System.out.print("Masukkan input ke 2 \t : ");
        String stc =  masuk.nextLine();
        
        Integer konversi1 = Integer.valueOf(str);
        Byte konversi2 = Byte.valueOf(stc);
        Short konversi3 = Short.valueOf(str);
        Long konversi4 = Long.valueOf(stc);
        Double konversi5 = Double.valueOf(str);
        Float konversi6 = Float.valueOf(stc);
        
        System.out.println("Hasil konversi String 1 ke Integer \t : " + konversi1);
        System.out.println("Hasil konversi String 2 ke byte \t : " + konversi2);
        System.out.println("Hasil konversi String 1 ke short \t : " + konversi3);
        System.out.println("Hasil konversi String 2 ke long \t : " + konversi4);
        System.out.println("Hasil konversi String 1 ke double \t : " + konversi5);
        System.out.println("Hasil konversi String 2 ke float \t : " + konversi6);
        
    }
}
