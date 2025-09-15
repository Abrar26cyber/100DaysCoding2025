
package Day008;

public class Main {
    public static void main(String[] args) {
        //pemanggilan tipe data non primitif String untuk teks dengan syarat didalam tanda petik ("")
        String nama,nim,fakultas,prodi;
        nama = "Abrar";
        nim = "D0225011";
        fakultas = "Teknik";
        prodi = "Informatika";
        
        System.out.println("Nama:" + nama);
        System.out.println("Nim:" + nim);
        System.out.println("Fakultas:" + fakultas);
        System.out.println("Prodi:" + prodi);
        
        String angka = "2+3";
        System.out.println("Penjumlahan:" + angka); // tetap akan menampilkan (2+3) karena di string dibaca sebagai teks
        
    }
    
}
