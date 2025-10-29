
public class TugasSortingBubbleDouble {

    public static void main(String[] args) {
        double[] decimal = {0.2, 0.12, 1.2, 2.3, 0.05, 0.008};
        sortBubbleDouble(decimal);
    }

    public static void sortBubbleDouble(double[] decimal) {
        System.out.println("Nilai pecahan sebelum di sorting =");
        for (double d : decimal) {
            System.out.print(d + ", ");
        }

        for (int i = 0; i < decimal.length - 1; i++) {
            for (int j = 0; j < decimal.length - 1; j++) {
                if (decimal[j] > decimal[j + 1]) {
                    double temp = decimal[j];
                    decimal[j] = decimal[j + 1];
                    decimal[j + 1] = temp;
                }
            }
        }

        System.out.println("\nNilai Desimal Setelah Di Urutkan =");
        for (double d : decimal) {
            System.out.print(d + ", ");
        }
    }
}
