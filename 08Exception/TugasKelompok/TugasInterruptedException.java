public class TugasInterruptedException {
    public static void main(String[] args) {
        // Membuat thread baru dengan tugas menghitung angka
        Thread threadHitung = new Thread(new HitungAngka());
        threadHitung.start(); // Menjalankan thread

        try {
            // Memberi waktu 2 detik agar thread lain berjalan
            Thread.sleep(2000);

            // Menginterupsi thread yang sedang berjalan
            System.out.println("Main thread: Menginterupsi proses hitung...");
            threadHitung.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Main thread terganggu: " + e.getMessage());
        }
    }
}

// Kelas yang mengimplementasikan Runnable
class HitungAngka implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) { // menggunakan tipe data int
                System.out.println("Menghitung: " + i);
                Thread.sleep(1000); // tidur 1 detik di setiap iterasi

                // Mengecek apakah thread telah diinterupsi
                if (Thread.interrupted()) {
                    System.out.println("Thread hitung diinterupsi pada angka ke-" + i);
                    return; // keluar dari loop
                }
            }
            System.out.println("Thread hitung selesai tanpa interupsi.");
        } catch (InterruptedException e) {
            System.out.println("Thread hitung berhenti karena InterruptedException.");
        }
    }
}
