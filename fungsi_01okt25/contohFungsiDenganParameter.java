package fungsi_01okt25;

import java.util.Scanner;

public class ContohFungsiDenganParameter {

    // Fungsi luas persegi
    int hitungLuasPersegi(int sisi){
        int hasil = sisi * sisi;
        return hasil;
    }

    // Fungsi buat jalanin
    public static void main(String[] args) {

        // Try untuk panggil scanner
        try(Scanner inputan = new Scanner(System.in)){

            // Buat objek (karena gak static)
            ContohFungsiDenganParameter c = new ContohFungsiDenganParameter();

            // Tulisan diatas inputan
            System.out.println("Masukkan luas persegi !");

            // Tempat inputan muncul
            int sisi = inputan.nextInt();

            // Buat variabel luas untuk menyimpan nilai return fungsi hitung luas persegi
            int luas = c.hitungLuasPersegi(sisi);

            // Cetak hasil rumus tadi
            System.out.println("Luas Persegi = " + luas + " cm");

        }
    }
}
