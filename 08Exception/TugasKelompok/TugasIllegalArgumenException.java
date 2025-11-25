public class TugasIllegalArgumenException {
    public static void main(String[] args) {
        try {
            setUmur(-3); // Coba kirim nilai tidak valid
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
        
        System.out.println("Program tetap berjalan dengan aman");
    }

    public static void setUmur(int umur) {
        if (umur < 0) {
            throw new IllegalArgumentException("Umur tidak boleh negatif : " + umur);
        }
        System.out.println("Umur diset ke : " + umur);
    }
}
