package prodas_17sept25;

import java.util.Scanner;

public class nested_nilai_akhir_dengan_rentang_nilai {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Inputkan Nilai Akhir Mahasiswa:");
            int nilai = scan.nextInt();
            if (nilai == 100 && nilai >= 95) {
                System.out.println("Nilai A+");
            } else if (nilai <= 90 && nilai >= 85) {
                System.out.println("Nilai A");
            } else if (nilai <= 85 && nilai >= 80) {
                System.out.println("Nilai B+");
            } else if (nilai <= 80 && nilai >= 75) {
                System.out.println("Nilai B");
            } else if (nilai <= 75 && nilai >= 65) {
                System.out.println("Nilai C+");
            } else if (nilai <= 65 && nilai >= 55) {
                System.out.println("Nilai C");
            } else if (nilai <= 55 && nilai >= 50) {
                System.out.println("Nilai D+");
            } else if (nilai <= 50 && nilai >= 40) {
                System.out.println("Nilai D");
            } else if (nilai <= 40 && nilai >= 0) {
                System.out.println("Nilai E");
            } else {
                System.out.println("Anda Salah Input Nilai!!");
            }
        }
    }
}
