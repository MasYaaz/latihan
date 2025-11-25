import java.util.Scanner;

public class TugasNestedNilaiAkhirDenganRentangNilai {

    public static void main(String[] args) {

        // Fungsi Try berisi Scanner
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Inputkan Nilai Akhir Mahasiswa:");

            // Deklarasi Variabel
            int nilai = scan.nextInt();
            String hasil;

            // Percabangan if else nested
            if (nilai == 100 && nilai >= 95) {
                hasil = "Nilai A+";
            } else if (nilai <= 90 && nilai >= 85) {
                hasil = "Nilai A";
            } else if (nilai <= 85 && nilai >= 80) {
                hasil = "Nilai B+";
            } else if (nilai <= 80 && nilai >= 75) {
                hasil = "Nilai B";
            } else if (nilai <= 75 && nilai >= 65) {
                hasil = "Nilai C+";
            } else if (nilai <= 65 && nilai >= 55) {
                hasil = "Nilai C";
            } else if (nilai <= 55 && nilai >= 50) {
                hasil = "Nilai D+";
            } else if (nilai <= 50 && nilai >= 40) {
                hasil = "Nilai D";
            } else if (nilai <= 40 && nilai >= 0) {
                hasil = "Nilai E";
            } else {
                hasil = "Anda Salah Input Nilai!!";
            }

            // Cetak nilai hasil
            System.out.println(hasil);
        }
    }
}
