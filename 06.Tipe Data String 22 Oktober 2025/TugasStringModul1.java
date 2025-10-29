import java.util.Scanner;

public class TugasStringModul1 {

    void contohsatu() {
        String var1 = "Belajar Java";
        String var2 = "Uinsa";
        System.out.print(var1);
        System.out.print(" " + var2);
    }

    void contohdua() {
        String var1 = "Belajar Java";
        String var2 = "Uinsa";
        System.out.print(var1 + " " + var2);
    }

    void contohtiga() {
        String var1 = "Belajar \nJava \ndi \"Uinsa\"";

        System.out.print(var1);
    }

    void contohempat() {
        try (Scanner input = new Scanner(System.in)) {
            String nama, alamat, hobi;
            System.out.println("Nama :");
            nama = input.nextLine();
            System.out.println("Alamat :");
            alamat = input.nextLine();
            System.out.println("Hobi :");
            hobi = input.nextLine();
            System.out.println("## Hasil ##");
            System.out.println("Nama : " + nama);
            System.out.println("Alamat : " + alamat);
            System.out.println("Hobi : " + hobi);
        }
    }

    void contohlima() {
        String var1 = "Belajar Java";
        System.out.println(var1.length());
        System.out.println(var1.toUpperCase());
        System.out.println(var1.toLowerCase());
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            TugasStringModul1 ob = new TugasStringModul1();
            String pilihan;
            System.out.println("Mau Munculin contoh yang mana?");
            pilihan = input.nextLine();
            switch (pilihan) {
                case "contoh1" -> ob.contohsatu();
                case "contoh2" -> ob.contohdua();
                case "contoh3" -> ob.contohtiga();
                case "contoh4" -> ob.contohempat();
                case "contoh5" -> ob.contohlima();
                default -> System.out.println("Inputan Kamu salah!");
            }
        }
    }
}
