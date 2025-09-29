package prodas_24sept25;

import java.util.Scanner;

public class tugasloopfornested {

    public static void main(String args[]) {

        // Deklarasi Variabel
        int jumlah, i, j;

        // Scanner yang dideklarasikan dengan try
        try (Scanner inputan = new Scanner(System.in)) {

            // Tulisan diatas input Scanner
            System.out.println("Masukkan Inputan Angka?");

            // Tempat Scanner dipakai
            jumlah = inputan.nextInt();

            // Fungsi perulangan For nested untuk membentuk tangga
            // bintang dengan perkalian 2 dengan jumlah sesuai input scanner
            for (i = 1; i <= jumlah; i++) {
                for (j = 1; j <= i * 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
