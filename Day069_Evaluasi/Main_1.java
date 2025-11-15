package Day069_Evaluasi;

import java.util.Scanner;

public class Main_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai: ");
        int n = in.nextInt();
        String ab;
        
        if (n >= 90 && n <= 100) {
            ab = "A";
        }else if (n >= 80 && n < 90) {
            ab = "B";
        }else if (n >= 70 && n < 80) {
            ab = "C";
        }else if (n >= 60 && n < 70) {
            ab = "D";
        }else if (n >= 0 && n < 60) {
            ab = "E";
        }else{
            ab = "Eror";
        }
        System.out.println(ab);
    }
}
