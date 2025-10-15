package array_15okt25;

public class tugasarray1dimensi {
    public static void main(String[] args) {
        // Deklarasi variabel array 1 dimensi
        String[] matkul = {"Pemrograman Dasar", "Matematika Deskrit", "Literasi Digital", "Pengantar Studi Islam", "Pancasila", "Konsep Sistem Informasi"};
        
        // Cetak array secara urut dengan looping for
        for(String matkul1 : matkul ){

            // Cetak array secara vertikal
            System.out.println(" | "+matkul1 + " | ");
        }
    }
}
