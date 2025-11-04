public class TugasMergeSort {

    public static void main(String[] args) {
        double jarakkota[] = {98.5, 76.2, 25.0, 12.75, 54.4};
        int n = jarakkota.length;

        System.out.println("Jarak Kota Sebelum Diurutkan =");
        for (double a : jarakkota) {
            System.out.print(a + " ");
        }

        mergeSort(jarakkota, 0, n - 1);

        System.out.println("\nJarak Kota Setelah Diurutkan =");
        for (double a : jarakkota) {
            System.out.print(a + " ");
        }
    }

    public static void mergeSort(double data[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(data, left, mid);
            mergeSort(data, mid + 1, right);
            merge(data, left, mid, right);
        }
    }

    public static void merge(double data[], int left, int mid, int right) {
        double temp[] = new double[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (data[i] < data[j]) {
                temp[k++] = data[i++];
            } else {
                temp[k++] = data[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = data[i++];
        }

        while (j <= right) {
            temp[k++] = data[j++];
        }

        System.arraycopy(temp, 0, data, left, temp.length);
    }
}
