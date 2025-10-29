public class tugasarray3dimensi {
    public static void main(String[] args) {
        // Deklarasi variabel tabelnilai untuk array 3 dimensi
        int [][][] tabelnilai = {{{1,2,3,4},{5,6,7,8},{9,10,11,12}},{{13,14,15,16},{17,18,19,20},{21,22,23,24}}};

        // Cetak tabel nilai dengan 3 inputan [] input pertama untuk array lapisan, input kedua untuk baris dan input ketiga untuk kolom
        System.out.println(tabelnilai[1][2][2]);
    }
}
