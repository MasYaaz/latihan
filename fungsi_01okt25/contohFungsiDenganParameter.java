package fungsi_01okt25;

import java.util.Scanner;

public class contohFungsiDenganParameter {

    // Fungsi luas persegi
    int hitungLuasPersegi(int sisi){
        int hasil = sisi * sisi;
        System.out.println("Luas Persegi = " + hasil + " cm");
        return hasil;
    }

    // Fungsi buat jalanin
    public static void main(String[] args) {

        // Try untuk panggil scanner
        try(Scanner inputan = new Scanner(System.in)){

            // Deklarasi class biar singkat
            contohFungsiDenganParameter c = new contohFungsiDenganParameter();

            // Tulisan diatas inputan
            System.out.println("Masukkan luas persegi !");

            // Tempat inputan muncul
            int sisi = inputan.nextInt();

            // Jalankan fungsinya
            c.hitungLuasPersegi(sisi);
        }
    }
}
