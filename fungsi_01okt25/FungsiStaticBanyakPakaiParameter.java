package fungsi_01okt25;

public class FungsiStaticBanyakPakaiParameter {

    // Fungsi luas persegi
    static int luasPersegi(int sisi){
        return = sisi * sisi;
    }

    // Fungsi luas segitiga
    static double luasSegitiga (int alas, int tinggi){
        return = 0.5 * alas * tinggi;
    }

    // Fungsi volume kubus
    static int volumeKubus(int panjang, int lebar, int tinggi){
        return = panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        System.out.println("Luas Persegi = " + luasPersegi(10) + " cm²");
        System.out.println("Luas Segitiga = " + luasSegitiga(10, 15) + " cm²");
        System.out.println("Volume Kubus = " + volumeKubus(2, 3, 5) + " cm³");
    }
}
