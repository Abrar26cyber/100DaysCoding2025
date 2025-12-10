package Day094;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nm = in.nextLine();
        garis();
        nama(nm);
        sapa();
        garis();
    }
    static void nama (String ab){
        System.out.println("Hai " +ab);
    }
    static void sapa(){
        System.out.println("Apa Kabar mu hari ini!");
    }
    static void garis(){
        System.out.println("=============================================");
    } 
}
