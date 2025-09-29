package prodas_24sept25;

import java.util.Scanner;

public class tugasloopdowhilescanner {

    public static void main(String args[]) {
        int pilihan;
        String jawaban;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Mau Pesan Makanan Apa?");
            System.out.println("1. Nasi Padang");
            System.out.println("2. Ayam Goreng + Nasi");
            System.out.println("3. Sate + Nasi");
            System.out.println("4. Tidak Jadi");
            System.out.println("----------------------------------");
            do {
                System.out.println("Masukkan kodenya untuk tampilkan harganya!");
                pilihan = scan.nextInt();
                jawaban = switch (pilihan) {
                    case 1 ->
                        "Rp. 15.000";
                    case 2 ->
                        "Rp. 12.000";
                    case 3 ->
                        "Rp. 10.000";
                    case 4 ->
                        "Oke Terima Kasih...";
                    default ->
                        "Masukkan kode nomernya dengan benar!";
                };
                System.out.println(jawaban);
                System.out.println("----------------------------------");
            } while (pilihan != 4);
        }
    }
}
