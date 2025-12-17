package Day100_Evaluasi;

import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String n = in.nextLine();
        boolean ai = false;
        boolean as = false;
        boolean ac = false;
        
        n = n.toUpperCase();
        
        for (int i = 0; i < n.length(); i++) {
            char ab = n.charAt(i);
            
            if (ab == 'I') {
                ai = true;
            }
            if (ab == 'S' && ai) {
                as = true;
            }
            if (ab == 'C' && ai && as ) {
                ac = true;
            }
        }
        if (ac) {
            System.out.println("CANTIK"); 
        }else{
            System.out.println("TIDAK CANTIK");
        }
    }
}
