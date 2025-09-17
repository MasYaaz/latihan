package prodas_17sept25;

import java.util.Scanner;

public class kuliah {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String jurusan, kls;
            String harga;
            System.out.println("1. Jurusan Ekonomi - Kelas Pagi");
            System.out.println("2. Jurusan Ekonomi - Kelas Malam");
            System.out.println("3. Jurusan Sastra Indonesia - Kelas Pagi");
            System.out.println("4. Jurusan Sastra Indonesia - Kelas Malam");
            System.out.print("Masukkan kode : ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1 -> {
                    jurusan = "Ekonomi";
                    kls = "Pagi";
                    harga = "Rp 1.750.000";
                }
                case 2 -> {
                    jurusan = "Ekonomi";
                    kls = "Malam";
                    harga = "Rp 2.000.000";
                }
                case 3 -> {
                    jurusan = "Sastra Indonesia";
                    kls = "Pagi";
                    harga = "Rp 1.900.000";
                }
                case 4 -> {
                    jurusan = "Sastra Indonesia";
                    kls = "Malam";
                    harga = "Rp 2.300.000";
                }
                default -> {
                    jurusan = "Data Tidak ada";
                    kls = "Tidak Ada";
                    harga = "Rp 0";
                }
            }
            System.out.println("----------------------------------");
            System.out.println("Jurusan Kuliah : " + jurusan);
            System.out.println("Kelas Kuliah : " + kls);
            System.out.println("Biaya Kuliah : " + harga);
        }
    }
}
