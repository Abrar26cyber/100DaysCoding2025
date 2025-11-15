package Day069_Evaluasi;

import java.util.Scanner;

public class Main_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int bom = 55;
        int bt = 0;
        int ba = 100;
        
        for (;;) {
            System.out.printf("Masukkan (%d - %d): ",bt, ba);
            int h = in.nextInt();
            
            if (h < bom && h > bt) {
                bt  = h;
            }else if (h > bom && h < ba) {
                ba = h;
            }else if (h == bom) {
                System.out.println("Bom");
                break;
            }
        }
    }

}
