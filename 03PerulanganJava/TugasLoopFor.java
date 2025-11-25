import java.util.Scanner;

public class TugasLoopFor {

    public static void main(String[] args) {

        // Deklarasi Variabel
        int i, jumlah;

        // Fungsi try dengan scanner
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.println("Masukan Inputnya!");
            jumlah = inputan.nextInt();

            // Fungsi looping for dengan input untuk nilai pertama dan loopingnya decerement, maksudnya nilai loopingnya mundur / berkurang
            for (i = jumlah; i > 0; i--) {
                System.out.println("i = " + i);
            }
        }
    }
}
