
public class TugasSortingBubbleChar {

    public static void main(String[] args) {
        char[] karakter = {'A', 'H', 'B', 'Z', 'Y', 'X'};
        bubbleSortChar(karakter);
    }

    public static void bubbleSortChar(char[] nilai) {
        System.out.println("Karakter Sebelum Di Urutin =");
        for (char k : nilai) {
            System.out.print(k + ", ");
        }

        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    char temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println("\nKarakter Setelah Diurutin =");
        for (char k : nilai) {
            System.out.print(k + ", ");
        }
    }
}
