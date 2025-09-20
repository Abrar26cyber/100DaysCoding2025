
package Day013Evaluasi;
public class Soal1 {
    public static void main(String[] args) {
        //penggunaan printf
        String nama = "Budi";
        int umur = 21;
        float tb = 170.5f;
        double bb = 65.4;
        byte absen = 12;
        short Sks = 144;
        String nim = "D0225011";
        char jk = 'L';
        boolean aktif = true;
        
        System.out.printf("Nama%s Umur%d Tinggi badan%.2f berat badan %.2f Absen%d jumlah sks%d Nomor nim%s jenis kelamin%c Status aktif%b", nama,umur,tb,bb,absen,Sks,nim,jk,aktif);
    }
}
