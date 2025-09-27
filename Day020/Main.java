package Day020;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //mengubahh tipe data Primitif ke tipe data
        Scanner masuk = new Scanner (System.in);
        System.out.print("Masukkan input ke 1 \t : ");
        int angkaInt = masuk.nextInt();
        String str = String.valueOf(angkaInt);
        
        System.out.print("Masukkan input ke 2 \t : ");
        long angkaLong =  masuk.nextLong();
        String stc = String.valueOf(angkaLong);
        
        System.out.print("Masukkan input ke 3 \t : ");
        float angkaFloat =  masuk.nextFloat();
        String std = String.valueOf(angkaFloat);
        
        System.out.print("Masukkan input ke 4 \t : ");
        double angkaDouble =  masuk.nextDouble();
        String stb= String.valueOf(angkaDouble);
        
        System.out.println();
        
        System.out.println("Value dari tipe data Integer \t\t : " + angkaInt);
        System.out.println("Hasil konversi Integer ke String \t : " + str);
        System.out.println("Value dari tipe data long \t\t : " + angkaLong);
        System.out.println("Hasil konversi long ke String \t\t : " + stc);
        System.out.println("Value dari tipe data float \t\t : " + angkaFloat);
        System.out.println("Hasil konversi float ke String \t : " + std);
        System.out.println("Value dari tipe data double \t\t : " + angkaDouble);
        System.out.println("Hasil konversi double ke String \t : " + stb);
 
        
    }
}
