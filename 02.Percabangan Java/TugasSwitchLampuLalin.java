package percabangan_17sept25;

import java.util.Scanner;

public class TugasSwitchLampuLalin {

    public static void main(String[] args) {
        // Fungsi Try yang didalamnya ada scanner
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Warna Lampu Lalu Lintas :");

            // Scanner input
            String lampu = scan.next();

            // Percabangan Switch
            String hasil = switch (lampu) {
                case "Merah" ->
                    "Berhenti Dulu Mas!";
                case "Kuning" ->
                    "Hati-Hati Mas!";
                case "Hijau" ->
                    "Monggo Jalan.";
                default ->
                    "Lampunya Mati";
            };

            // Output dengan cetak nilai hasil
            System.out.println(hasil);
        }
    }
}
