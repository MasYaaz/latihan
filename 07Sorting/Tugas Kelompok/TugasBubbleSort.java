public class TugasBubbleSort {

    public static void main(String[] args) {
        String[] negara = {"Singapura", "Brunei", "Malaysia", "Palestina", "Indonesia", "Vietnam"};
        bubbleSortString(negara);
    }

    public static void bubbleSortString(String[] negara) {
        System.out.println("== SEBELUM DIURUTKAN ==");
        for (String n : negara) {
            System.out.print(n + " ");
        }

        for (int i = 0; i < negara.length - 1; i++) {
            for (int j = 0; j < negara.length - 1 - i; j++) {
                if (negara[j].compareTo(negara[j + 1]) > 0) {
                    String tamp = negara[j];
                    negara[j] = negara[j + 1];
                    negara[j + 1] = tamp;
                }
            }
        }

        System.out.println("\n== SESUDAH DIURUTKAN ==");
        for (String n : negara) {
            System.out.print(n + " ");
        }
    }
}
