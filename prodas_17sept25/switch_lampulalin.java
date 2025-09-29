package prodas_17sept25;

import java.util.Scanner;

public class switch_lampulalin {

    public static void main(String[] args) {
        // Fungsi Try yang didalamnya ada scanner
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Warna Lampu Lalu Lintas :");

            // Deklarasi Variabel
            String lampu = scan.next();
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

            // Output
            System.out.println(hasil);
        }
    }
}
