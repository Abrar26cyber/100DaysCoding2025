package Day090;

import java.util.Scanner;

public class Main {

    static int a;
    static int b;
    
    static int coba(){
        if (a > b) {
            return a - b;
        }else{
            return b - a;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka pertama: ");
        a = in.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = in.nextInt();
        
        int selisih = coba();
        System.out.printf("Selisih %d dengan %d adalah: %d %n", a, b, selisih);
    }
    

}
