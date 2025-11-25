
public class ContohSortingBubbleString {

    public static void main(String[] args) {
        String[] nama = {"Mahdi", "Aflah", "Yazdi"};
        bubbleSortString(nama);
    }

    public static void bubbleSortString(String[] kata) {
        System.out.println("Nama Sebelum Diurutin :");
        for (String k : kata) {
            System.out.print(k + ", ");
        }

        for (int i = 0; i < kata.length - 1; i++) {
            for (int j = 0; j < kata.length - 1; j++) {
                if (kata[j].compareTo(kata[j + 1]) > 0) {
                    String temp = kata[j];
                    kata[j] = kata[j + 1];
                    kata[j + 1] = temp;
                }
            }
        }

        System.out.println("\nKata Setelah Di Urutkan :");
        for (String k : kata) {
            System.out.print(k + ", ");
        }
    }
}
