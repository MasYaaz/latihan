package fungsi_01okt25;

import java.util.Scanner;

// deklarasi kelas
public class ContohProsedurTanpaParameter {
    // variabel sisi
    int sisi;

    // Prosedur hitung luas persegi
    void hitungLuasPersegi() {
        
        // rumusnya
        int hasil = sisi * sisi;

        // Output
        System.out.println("luas persegi = " + hasil);
    }

    // Fungsi untuk menjalankan / run
    public static void main(String[] args) {

        // deklarasi untuk class jadi p biar lebih singkat
        ContohProsedurTanpaParameter p = new ContohProsedurTanpaParameter();

        // Try untuk nambahin Scanner
        try (Scanner inputan = new Scanner(System.in)){
            System.out.println("Masukkan Nilai Sisi!!");

            // ini tempat input scannernya muncul / dipakai
            p.sisi = inputan.nextInt();

            // panggil output dari fungsinya
            p.hitungLuasPersegi();
        }
    }
}
