package fungsi_01okt25;

import java.util.Scanner;

public class contohFungsiTanpaParameter {
    int sisi;

    // Fungsi
    int hitungLuasPersegi(){
        int hasil = sisi * sisi;
        System.out.println("Luas Persegi = " + hasil +"cm");
        return hasil;
    };
    public static void main(String[] args) {
        try (Scanner inputan = new Scanner(System.in)){
            System.out.println("Masukkan sisi persegi!");
            contohFungsiTanpaParameter f = new contohFungsiTanpaParameter();
            f.sisi = inputan.nextInt();
            f.hitungLuasPersegi();
        }
    }
}
