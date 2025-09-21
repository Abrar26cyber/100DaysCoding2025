package Day014;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        //mengubah (mengkonversi) tipe data non primitif ke primitif
        System.out.print("Masukkan aangka\t :");
        String angka1 = masuk.nextLine();
        
        double data1 = Double.parseDouble(angka1);
        float data2 = Float.parseFloat(angka1);
        
        String angka2 = Float.toString(data2);//mengubah data primitif ke non primitif
        angka2 = "100"; // update nilai karena bilangan berkoma tidak dapat dikonversi kebilangan bulat
        
        int data3 = Integer.parseInt(angka2) * 4;
        short data4 = Short.parseShort(angka2);
        byte data5 = Byte.parseByte(angka2);
        long data6 = Long.parseLong(angka2) * 5;
        
        char data7 = angka2.charAt(1);
        
        System.out.println("Value dari data String \t\t :" + angka1);
        System.out.println("Hasil konversi String ke double \t :" + data1);
        System.out.println("Hasil konversi float ke String \t :" + data2);
        System.out.println();
        System.out.println("Hasil konversi String ke integer \t :" + data3);
        System.out.println("Hasil konversi String ke short \t :" + data4);
        System.out.println("Hasil konversi String ke byte \t\t :" + data5);
        System.out.println("Hasil konversi String ke long \t\t :" + data6);
        System.out.println("Character \t\t\t\t :" + data7);
        
        
    }
    
}
