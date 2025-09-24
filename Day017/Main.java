package Day017;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        //operator aritmatika sisa bagi atau modulus (%)
        Scanner masuk = new Scanner (System.in);
        
        System.out.print("Masukkan Angka \t\t : ");
        int angkaA = masuk.nextInt();
        
        System.out.print("Masukkan operator \t : ");
        char operator = masuk.next().charAt(0);
        
        System.out.print("Masukkan Angka \t\t : ");
        int angkaB = masuk.nextInt();
        
        double hasilBagi;
        double modulus = 0;
        
        if(operator == '/' && modulus != 0){
            hasilBagi = angkaA / angkaB;
            modulus  = angkaA % angkaB;
            System.out.println("Hasil bagi \t\t : " + hasilBagi);
            System.out.println("Modulus \t\t : " +  modulus);
        }else{
            hasilBagi = angkaA / angkaB;
            System.out.println("Hasil bagi \t\t : " + hasilBagi);
            System.out.println("tidak ada sisa bagi dari hasil pembagian atau moodulusnya = " + modulus);
        }
        
 
    }
    
}
