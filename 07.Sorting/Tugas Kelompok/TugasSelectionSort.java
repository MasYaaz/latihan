
public class TugasSelectionSort {

    public static void main(String[] args) {
        int nilai[] = {98, 75, 86, 67, 34, 28, 52};
        selectionSortInt(nilai);
    }

    public static void selectionSortInt(int[] bilangan) {
        System.out.println("== SEBELUM DIURUTKAN ==");
        for (int bil : bilangan) {
            System.out.print(bil + " ");
        }

        // Algoritma Selection Sort
        for (int i = 0; i < bilangan.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < bilangan.length; j++) {
                if (bilangan[j] < bilangan[indexMin]) {
                    indexMin = j;
                }
            }

            // Tukar posisi elemen terkecil ke posisi i
            int temp = bilangan[indexMin];
            bilangan[indexMin] = bilangan[i];
            bilangan[i] = temp;
        }

        System.out.println("\n\n== SESUDAH DIURUTKAN ==");
        for (int bil : bilangan) {
            System.out.print(bil + " ");
        }
    }
}
