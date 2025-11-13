
import java.util.Scanner;


public class ExceptionHandling {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.println("** Pilihan Exception Handling **");
            System.out.println("|| 1. Program Tanpa Exception Handling ||");
            System.out.println("|| 2. Program Dengan Try-Catch Handling ||");
            System.out.println("|| 3. Program Dengan Try-Catch-Finally Handling ||");
            System.out.println("\nKetik Nomer pilihan!");
            ExceptionHandling E = new ExceptionHandling();
            
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1 -> E.WithoutExceptionHandling();
                case 2 -> E.WithExceptionHandling();
                case 3 -> E.TryCatchFinally();
            }
        }
    }

    void WithoutExceptionHandling() {
        System.out.println("\n ***** PROGRAM TANPA EXCEPTION HANDLING *****");
        int hasil = 9 / 0;
        System.out.println("Hasil Pembagian = " + hasil);
        System.out.println("Pernyataan Setelah Bebas Dari Exception");
    }
    
    // Soal
    // A. Lakukan kompilasi dari eksekusi program kemudian tunjukkan hasilnya!
    // B. Berikan penjelasan terkait jalannya program ini!

    // Jawaban
    // A. Ketika di runtime terminal tetap muncul pemberitahuan exceptionnya dan 
    //    baris kode tempat tejadinya exception tetapi perintah cetaknya tidak
    //    dijalankan karena error
    // B. Program dijalankan kemudian sistem mengenali error dan kemudian runningnya
    //    terhenti dengan pesan exception error

    void WithExceptionHandling() {
        System.out.println("\n ***** PROGRAM DENGAN EXCEPTION HANDLING *****");
        try {
            int hasil = 9 / 0;
            System.out.println("Hasil Pembagian = " + hasil);
            System.out.println("Pernyataan setalah bebas dari Exception");
        } catch (ArithmeticException exc) {
            System.err.println("Aritmetic Error : Menangkap exception hasil pembagian dari nol");
            System.err.println("Exception yang ditangkap adalah : " + exc);
        }
        System.out.println("\nPernyataan diluar blok try-catch.");
    }

    // Soal
    // 1. Lakukan Kompilasi dan eksekusi program kemudian tunjukan hasilnya!
    // 2. Berikan jawaban terkait jalannya program ini!
    // 3. Buatlah pernyataan yang tidak menyebabkan exception sehingga pernyataan
    //    terakhir dalam blok try dapat ditampilkan? Lakukan kompilasi dan eksekusi
    //    Program kemudian tunjukkan hasilnya! Berikan Penjelasan Singkat!

    // Jawaban
    // 1. Terdapat pada Terminal runtime
    // 2. Muncul Exception Handling dari Try-Catch dengan tulisan "Exception yang 
    //    ditangkap adalah : java.lang.ArithmeticException: / by zero"
    // 3. rubah int hasil = 9/1

    void TryCatchFinally() {
        System.out.println("\n ***** PROGRAM DENGAN TRY-CATCH-FINALLY *****");
        try {
            int hasil = 9 / 0;
            System.out.println("Hasil Pembagian = " + hasil);
            System.out.println("Pernyataan setalah bebas dari Exception");
        } catch (ArithmeticException exc) {
            System.err.println("Aritmetic Error : Menangkap exception hasil pembagian dari nol");
            System.err.println("Exception yang ditangkap adalah :" + exc);
        } finally {
            System.out.println("Pernyataan dalam blok finally");
        }
        System.out.println("\nPernyataan diluar blok try-catch.");
    }

    // Soal
    // 1. Lakukan kompilasi dan eksekusi program kemudian tunjukkan hasilnya!
    // 2. Berikan penjelasan terkait jalannya program ini!

    // Jawaban
    // 1. Terdapat pada terminal runtime
    // 2. Muncul Exception Handling seperti Try-Catch sebelumnya dan ada tambahan
    //    blok finally yang selalu dijalankan walaupun program error
}
