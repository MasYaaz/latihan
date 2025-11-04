package perulangan_24sept25;

public class TugasLoopForNested {

    public static void main(String args[]) {

        // Deklarasi Variabel
        int i, j;

        // Variabel String Array 1 Dimensi
        String[] jenis = {"Makanan", "Minuman"};

        // Variabel String Array 2 Dimensi
        String[][] daftar = {
            {"Nasi Goreng", "Nasi Kebuli", "Mie Ayam"},
            {"Es Teh", "Kopi Hangat", "Susu Jahe"}
        };

        // Fungsi perulangan For nested untuk menampilkan daftar jenis menu beserta daftarnya
        // For yang pertama untuk memunculkan jenis makanan dengan iterasi / batas dari jumlah baris array daftar
        for (i = 0; i < daftar.length; i++) {
            System.out.println(jenis[i] + " :");

            // For kedua untuk mencetak daftar makanan dengan iterasi isi array daftar
            // Iterasi menggunakan daftar[i].length karena variabel i sudah terisi di for pertama
            for (j = 0; j < daftar[i].length; j++) {
                System.out.println(" -" + daftar[i][j]);
            }
            System.out.println();
        }
    }
}
