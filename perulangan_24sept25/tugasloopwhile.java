package perulangan_24sept25;

import java.util.Scanner;

public class tugasloopwhile {

    public static void main(String args[]) {

        // Deklarasi Variabel
        int jumlah, hitung = 1;

        // Fungsi try scanner
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.println("Masukkan Jumlah Huruf!");
            jumlah = inputan.nextInt();
            char huruf = 'A';

            // Fungsi looping while dengan output huruf berdasarkan jumlah huruf yang diinput
            while (hitung <= jumlah) {
                System.out.print(huruf);
                huruf++;
                hitung++;
            }
        }
    }
}
