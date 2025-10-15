package ujian;

public class prosedurfungsi {

    int panjang = 10, lebar = 5;

    static int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    void luasPersegiPanjang() {
        int hasil = panjang * lebar;
        System.out.println("hasil = " + hasil);
    }

    public static void main(String[] args) {
        System.out.println("Luas Persegi" + luasPersegi(5));
        prosedurfungsi p = new prosedurfungsi();
        p.luasPersegiPanjang();
    }
}
