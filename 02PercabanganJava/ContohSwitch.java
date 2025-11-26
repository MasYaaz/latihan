
import java.util.Scanner;

public class ContohSwitch {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Masukkan Nomor Urut Presiden :");
            int presiden = scan.nextInt();

            // rule switch (Java 14+)
            String hasil = switch (presiden) {
                case 1 ->
                    "Presiden ke-1 adalah Soekarno";
                case 2 ->
                    "Presiden ke-2 adalah Soeharto";
                case 3 ->
                    "Presiden ke-3 adalah Bachruddin Jusuf Habibie";
                case 4 ->
                    "Presiden ke-4 adalah Abdurrahman Wahid";
                case 5 ->
                    "Presiden ke-5 adalah Megawati Soekarno Putri";
                case 6 ->
                    "Presiden ke-6 adalah Susilo Bambang Yudhoyono";
                case 7 ->
                    "Presiden ke-7 adalah Joko Widodo";
                case 8 ->
                    "Presiden ke-8 adalah Prabowo Subianto";
                default ->
                    "Inputan kamu salah!!";
            };
            System.out.println(hasil);
        }
    }
}
