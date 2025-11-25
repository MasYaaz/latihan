import java.util.Scanner;

public class LoopDoWhileScanner {

    public static void main(String args[]) {
        // Deklarasi Variabel
        int bil, jumlah;

        // Fungsi scanner dengan try
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.println("Masukkan Angka!");
            jumlah = inputan.nextInt();

            bil = 1;
            // Fungsi do while
            do {
                if (bil % 2 != 0) {
                    System.out.println(bil);
                }
                bil++;
            } while (bil < jumlah);
        }
    }
}
