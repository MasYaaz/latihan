package prodas_24sept25;

import java.util.Scanner;

public class tugasloopfor {

    public static void main(String[] args) {

        // Deklarasi Variabel
        int i, jumlah;

        // Fungsi try dengan scanner
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.println("Masukan Inputnya!");
            jumlah = inputan.nextInt();

            // Fungsi looping for
            for (i = 12; i < jumlah; i--) {
                System.out.println("i = " + i);
            }
        }
    }
}
