
public class ContohSortingBubbleInteger {

    public static void main(String[] args) {
        int nilai[] = {98, 75, 86, 67, 81};
        bubbleSortInt(nilai);
    }

    public static void bubbleSortInt(int[] bilangan) {
        System.out.println("Sebelum di Urutkan =");

        // Loop For untuk cetak bilangan sebelum diurutin
        for (int bil : bilangan) {
            System.out.print(bil + ", ");
        }

        // Loop For nested untuk mengurutkan nilai bilangan
        for (int i = 0; i < bilangan.length - 1; i++) {
            for (int j = 0; j < bilangan.length - 1; j++) {
                if (bilangan[j] > bilangan[j + 1]) {
                    int temp = bilangan[j];
                    bilangan[j] = bilangan[j + 1];
                    bilangan[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSesudah Diurutkan =");

        // Loop For untuk cetak bilangan sesudah diurutin
        for (int bil : bilangan) {
            System.out.print(bil + ", ");
        }
    }
}
