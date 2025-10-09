package Day032;

public class Main {

    public static void main(String[] args) {
        boolean tiket = true;
        boolean viv = false;

        boolean izin = tiket || viv;

        System.out.printf("Apakah kamu memiliki tiket?  %B%n", tiket);
        System.out.printf("Apakah kamu memiliki kartu VIV?  %B%n", viv);
        System.out.println("Kamu memenuhi salah satu syarat untuk masuk: " + izin);
    }
}
