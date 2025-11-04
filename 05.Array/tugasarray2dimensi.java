public class tugasarray2dimensi {
    public static void main(String[] args) {
        // Deklarasi variabel String 2 dimensi
        String [][] datamahasiswa = {
            {"123","Bayu", "Sistem Informasi"},
            {"234","Budi", "Informatika"},
            {"345","Ali", "Sistem Informasi"}
        };

        // Cetak semua array datamahasiswa dengan loop for nested
        // loop for pertama
        for (String [] datamahasiswa1 : datamahasiswa){
            // loop for kedua
            for (int i = 0; i < datamahasiswa.length; i++){
                // Cetak nilai array
                System.out.print(" "+datamahasiswa1[i]+" ");
            }
            // Buat enter setiap looping
            System.out.println();
        }
    }
}
