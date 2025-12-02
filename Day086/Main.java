package Day086;

public class Main {

    public static void main(String[] args) {
        int[] angka = {10, 5, 67, 45, 345};
        int y = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print(angka[i] +" ");
            if (angka[i] < y) {
                y = angka[i];
            }
        }
        System.out.println("\n\nAngka minimal: " + y);
    }
}
