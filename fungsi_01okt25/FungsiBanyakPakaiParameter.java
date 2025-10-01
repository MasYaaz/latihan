package fungsi_01okt25;

public class FungsiBanyakPakaiParameter {

    // Fungsi luas persegi
    static int luasPersegi(int sisi){
        int hasil = sisi * sisi;
        System.out.println("Luas Persegi = " + hasil + " cm");
        return hasil;
    }

    // Fungsi luas segitiga
    static double luasSegitiga (int alas, int tinggi){
        double hasil = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga = " + hasil + " cm");
        return hasil;
    }

    // Fungsi volume kubus
    static int volumeKubus(int panjang, int lebar, int tinggi){
        int hasil = panjang * lebar * tinggi;
        System.out.println("Volume Kubus = " + hasil + " cm");
        return hasil;
    }

    public static void main(String[] args) {
        luasPersegi(10);
        luasSegitiga(10, 15);
        volumeKubus(2, 3, 5);
    }
}
