public class TugasIllegalStateException {
    private boolean selesai = false; // kondisi awal: belum selesai

    public void mulaiProses() {
        if (selesai) {
            throw new IllegalStateException("Proses tidak bisa dimulai karena status sudah selesai.");
        }
        System.out.println("Proses dimulai...");
        // simulasi proses selesai
        selesai = true;
        System.out.println("Proses selesai.");
    }

    public static void main(String[] args) {
        TugasIllegalStateException demo = new TugasIllegalStateException();

        try {
            demo.mulaiProses(); // proses pertama berhasil
            demo.mulaiProses(); // mencoba memulai lagi -> akan melempar IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        System.out.println("Program selesai.");
    }
}



    

