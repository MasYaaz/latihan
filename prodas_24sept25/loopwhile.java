package prodas_24sept25;

public class loopwhile {

    public static void main(String args[]) {
        // Deklarasi
        int bil;
        bil = 0;

        // Kondisi
        while (bil <= 20) {
            if (bil % 2 != 0) {
                System.out.println(bil);
            }

            // Peubah
            bil++;
        }
    }
}
