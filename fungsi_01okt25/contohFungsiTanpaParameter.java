package fungsi_01okt25;

import java.util.Scanner;

public class ContohFungsiTanpaParameter {
    int sisi;

    // Fungsi
    int hitungLuasPersegi(){
        return sisi * sisi;
    };
    public static void main(String[] args) {
        try (Scanner inputan = new Scanner(System.in)){

            // Buat objeknya fungsi
            ContohFungsiTanpaParameter f = new ContohFungsiTanpaParameter();

            // Tulisan diatas inputan
            System.out.println("Masukkan sisi persegi!");
            
            // Inputan Scanner
            f.sisi = inputan.nextInt();

            // Buat variabel luas untuk simpan hasil return
            int luas = f.hitungLuasPersegi();

            // Cetak nilai luas
            System.out.println("Luas Persegi = " + luas +"cm");
        }
    }
}
