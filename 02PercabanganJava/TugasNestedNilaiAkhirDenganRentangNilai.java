
import java.util.Scanner;

public class TugasNestedNilaiAkhirDenganRentangNilai {

    public static void main(String[] args) {

        // Fungsi Try berisi Scanner
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Inputkan Nilai Akhir Mahasiswa:");

            int nilai = scan.nextInt();
            String hasil;

            if (nilai >= 0 && nilai <= 100) {
                if (nilai >= 80) {
                    if (nilai >= 95) {
                        hasil = "Nilai A+";
                    } else if (nilai >= 85) {
                        hasil = "Nilai A";
                    } else {
                        hasil = "Nilai B+";
                    }
                } else if (nilai >= 65) {
                    if (nilai >= 75) {
                        hasil = "Nilai B";
                    } else if (nilai >= 70) {
                        hasil = "Nilai C+";
                    } else {
                        hasil = "Nilai C";
                    }
                } else {
                    if (nilai >= 50) {
                        hasil = "Nilai D";
                    } else {
                        hasil = "Nilai E";
                    }
                }

            } else {
                hasil = "Anda Salah Input Nilai!!!";
            }

            System.out.println(hasil);
        }
    }
}
