/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day004;


public class Main {
    public static void main(String[] args) {
        //penggunaan Escape Sequence
        System.out.println("Hello\nWord!"); //New line : untuk membuat baris  baru.
        System.out.println("Nama\tUmur\tAlamat");//Tab untuk membuat tabulasi (memindahkan teks ke tabulasi selanjutnya)
        System.out.println("Abrar\t18\tBanggai timur");
        
        System.out.println("contoh\"Double Quote\"");// Double qoute untuk membuat tanda kutip ganda dalam string dan dianggap bagian dari String bukan akhir dari String
        System.out.println("contoh \'Single Quote\'");//single qoute untuk membuat tanda kutip tunggal dalam String.
        System.out.println("Baris pertama\rBaris kedua");//Carriage return membuat kursor kembali ke awal baris dan akan menimpa teks sebelum \r.
        System.out.println("Saya\bang!");//Backbase : ketika menggunakan \b maka karakter sebelumnya akan dihapus
    }
    
}
