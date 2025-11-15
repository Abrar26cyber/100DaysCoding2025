package Day069_Evaluasi;

import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int y = 0;
        for (;;) {
            String b = in.nextLine();
            if (b.equals("maju")) {
                y += 1;
            }else if (b.equals("mundur")) {
                y -= 1;
            }else if (b.equals("stop")) {
                System.out.println("Berhenti jangan lanjut!!");
                break;
            }
            System.out.println(y);
        }
    }
}
