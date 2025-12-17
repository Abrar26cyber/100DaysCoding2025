package Day100_Evaluasi;

import java.util.Scanner;

public class Main {

    static int[] array;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int[] ar = new int [n];
        for (int i = 0; i < ar.length; i++) {
            ar [i] = in.nextInt();
        }
        int p = retas(ar);
        String sandi = kode(p);
        System.out.println("==============================================");
        System.out.println("Kode akun: " +sandi);
    }
    static int retas (int [] retas){
        int n = retas.length;
        array = new int [n];
        boolean [] terisi = new boolean [n];
        int y = 0;
        
        for(int x : retas){
            int idx = x % n;
            
            while(terisi[idx]){
                idx = (idx + 1)%n;
                y++;
            }
            array[idx] = x;
            terisi[idx] = true;
        }
        return y;
    }
    static String kode (int g){
        int panjang = g % 10;
        String ab = new String ();
        
            for (int i = 0; i < array.length && i < panjang; i++) {
            ab = ab + array[i];
        }       
        return ab;
    }
}