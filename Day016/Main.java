package Day016;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        //operator aritmatika perkalian dan pembagian
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan angka \t\t : ");
        int angkaKetiga = input.nextInt();
      
        System.out.print("Masukkan operator \t : ");
        char operator = input.next().charAt(0);
      
        System.out.print("Masukkan angka \t\t : ");
        int angkaKeempat = input.nextInt();
        
        double hasilOperasi;
        
        if(operator == '*'){
            hasilOperasi  = angkaKetiga * angkaKeempat;
            System.out.println("Hasil perkalian \t : " + hasilOperasi);
            
        }else if(operator == '/'){
            hasilOperasi = angkaKetiga / angkaKeempat;
            System.out.println("Hasil pembagian \t : " +hasilOperasi);
     
        } else{
            System.out.println("Operator tidak dikenali ");
        }       
      
    }
    
}
