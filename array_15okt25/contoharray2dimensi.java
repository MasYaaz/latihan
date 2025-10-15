package array_15okt25;

public class contoharray2dimensi {

    public static void main(String[] args) {
        // String[][] Teman = {{"73592", "Aflah", "SI"}, {"71111", "Mahdi", "IT"}};
        // System.out.println(Nomor[1][2]);
        // System.out.println("NIM : " +Teman[1][0]+ " | Nama : " + Teman[1][1]+ " | Prodi : " + Teman[1][2]);

        // Deklarasi Arraynya
        int[][] Nomor = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Buat tabel matriks dengan loop nested
        for (int[] Nomor1 : Nomor) {
            for (int j = 0; j < Nomor.length; j++) {
                System.out.print(Nomor1[j] + " | ");
            }
            System.out.println();
        }
    }
}
