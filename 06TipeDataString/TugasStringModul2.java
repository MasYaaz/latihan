import java.util.Scanner;

public class TugasStringModul2 {

    String text = "Saya Lagi Belajar";

    void charAt() {
        char charAt = text.charAt(5);
        System.out.println(charAt);
    }

    void length() {
        int length = text.length();
        System.out.println(length);
    }

    void toLowerCase() {
        String toLowerCase = text.toLowerCase();
        System.out.println(toLowerCase);
    }

    void toUpperCase() {
        String toUpperCase = text.toUpperCase();
        System.out.println(toUpperCase);
    }

    void contains() {
        boolean contains = text.contains("Siapa?");
        System.out.println(contains);
    }

    void substring() {
        String subString = text.substring(0, 5);
        System.out.println(subString);
    }

    void equals() {
        boolean equals = text.equals("Dutormasi");
        System.out.println(equals);
    }

    void isEmpty() {
        boolean isEmpty = text.isEmpty();
        System.out.println(isEmpty);
    }

    void replace() {
        String replace = text.replace("a", "o");
        System.out.println(replace);
    }

    void concat() {
        String concat = text.concat(" Di Kamar");
        System.out.println(concat);
    }

    void indexOf() {
        int indexOf = text.indexOf("Belajar");
        System.out.println(indexOf);
    }

    void trim() {
        String trim = text.trim();
        System.out.println(trim);
    }

    void valueOf() {
        int nilai = 2234;
        System.out.println(String.valueOf(nilai));
    }

    void compareTo() {
        String text2 = "Saya Lagi Di Sekolah";
        int compareTo = text.compareTo(text2);
        System.out.println(compareTo);
    }

    void format() {
        String nama = "Aflah";
        int umur = 19;
        String tulisan = String.format("Nama saya %s dan umur saya %d tahun", nama, umur);
        System.out.println(tulisan);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            TugasStringModul2 ob = new TugasStringModul2();
            System.out.println("Mau contoh method string yang mana?");
            String pilihan = input.nextLine();
            switch (pilihan) {
                case "charAt" -> ob.charAt();
                case "length" -> ob.length();
                case "toLowerCase" -> ob.toLowerCase();
                case "toUpperCase" -> ob.toUpperCase();
                case "substring" -> ob.substring();
                case "contains" -> ob.contains();
                case "equals" -> ob.equals();
                case "isEmpty" -> ob.isEmpty();
                case "concat" -> ob.concat();
                case "replace" -> ob.replace();
                case "indexOf" -> ob.indexOf();
                case "trim" -> ob.trim();
                case "valueOf" -> ob.valueOf();
                case "compareTo" -> ob.compareTo();
                case "format" -> ob.format();
                default -> System.out.println("Inputan Kamu salah!");
            }
        }

    }
}
