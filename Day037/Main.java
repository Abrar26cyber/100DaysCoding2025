
package Day037;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        int ab = input.nextInt();
        System.out.print("Masukkan bilangan bulat: ");
        int ac = input.nextInt();
        
        int tambah = ab + ac;
        System.out.println("Hasil penjumlahan = " + tambah);
        
        if (tambah %2 == 0 ) {
            System.out.println("Hasil tersebut merupakan angka genap");
        }else{
            System.out.println("Hasil tersebut merupakan angka ganjil");
        }
    }
}
