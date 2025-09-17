
import java.util.Scanner;

public class if1 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Inputkan Nilai:");
            int nilai = scan.nextInt();
            if (nilai >= 85) {
                System.out.println("Nilai A");
            } else if (nilai >= 70) {
                System.out.println("Nilai B");
            } else if (nilai >= 60) {
                System.out.println("Nilai C");
            } else if (nilai >= 50) {
                System.out.println("Nilai D");
            } else {
                System.out.println("Nilai E");
            }
        }
    }
}
