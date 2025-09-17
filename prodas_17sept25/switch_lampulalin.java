package prodas_17sept25;

import java.util.Scanner;

public class switch_lampulalin {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Warna Lampu Lalu Lintas :");
            String lampu = scan.next();

            String hasil = switch (lampu) {
                case "merah" ->
                    "Berhenti Dulu Mas!";
                case "kuning" ->
                    "Hati-Hati Mas!";
                case "hijau" ->
                    "Monggo Jalan.";
                default ->
                    "Lampunya Mati";
            };

            System.out.println(hasil);
        }
    }
}
