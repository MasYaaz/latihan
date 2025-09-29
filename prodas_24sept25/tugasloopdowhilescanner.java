package prodas_24sept25;

import java.util.Scanner;

public class tugasloopdowhilescanner {

    public static void main(String args[]) {
        int pilihan;
        String jawaban;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Masukan Nilai!");
            do {
                pilihan = scan.nextInt();
                jawaban = switch (pilihan) {
                    case 1 ->
                        "Selamat Datang!";
                    case 2 ->
                        "Selamat Tinggal!";
                    case 3 ->
                        "Aplikasi Selesai!";
                    default ->
                        "Input Tidak Valid";
                };
                System.out.println(jawaban);
            } while (pilihan != 3);
        }
    }
}
