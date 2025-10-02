package fungsi_01okt25;

import java.util.Scanner;

// Deklarasi kelas
public class ContohProsedurDenganParameter {

    // Prosedur hitung luas persegi
    void hitungLuasPersegi(int sisi) {
        int hasil = sisi * sisi;
        System.out.println("luas persegi = " + hasil + " cm");
    }

    // Fungsi untuk jalanin prosedur
    public static void main(String[] args) {
        // Try untuk tampilin scanner
        try (Scanner inputan = new Scanner(System.in)) {
            ContohProsedurDenganParameter p = new ContohProsedurDenganParameter();
            System.out.println("masukkan nilai sisi persegi!");

            // Inputan scanner
            int sisi = inputan.nextInt();

            // Hasil pengerjaan
            p.hitungLuasPersegi(sisi);
        }
    }
}
