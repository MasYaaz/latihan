import java.util.Scanner;

public class contohstringscanner {

    public static void main(String[] args) {
        String text1;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan inputan teksnya!");
            text1 = input.next();
        }
        System.out.println(text1.toLowerCase());
    }
}
