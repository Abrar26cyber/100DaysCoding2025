package Day015;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // operator aritmatika penjumlahan dan pengurangan
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan angka \t :");
        int angkaPertama = in.nextInt();
        
        System.out.print("Masukkan operator \t :");
        char operator = in.next().charAt(0);
        
        System.out.print("Masukkan angka \t :");
        int angkaKedua = in.nextInt();
        
        int hasil = 0;
        
        if(operator == '+'){
            hasil = angkaPertama + angkaKedua;
        }else if (operator == '-'){
            hasil = angkaPertama + angkaKedua;
        }else{
            System.out.println("Error");
        }
        System.out.printf("Jawabannya adalah %d\n:",hasil);
    }
    
}
