package prodas_17sept25;

import java.util.Scanner;

public class switch_lampulalin {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Warna Lampu Lalu Lintas :");
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

            System.out.println(hasil);
        }
    }
}
