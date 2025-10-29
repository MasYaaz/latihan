package perulangan_24sept25;

import java.util.Scanner;

public class loopwhilescanner {

    public static void main(String args[]) {
        // Deklarasi Variabel
        int i, jumlah;

        // Deklarasi Scanner pakai Try
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.println("Masukan Jumlah Inputan!");
            jumlah = inputan.nextInt();

            i = 1;
            while (i < jumlah) {
                System.out.println("Perulangan ke-" + i);
                i++;
            }
        }
    }
}
