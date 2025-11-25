
public class TugasArrayIndexOutOfBoundsException {

    public static void main(String args[]) {
        int p[] = new int[9];
        try {
            int i = 9;
            p[i] = 100;
            System.out.println("Cetak Array : "+ p[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Array melebihi batas");
        }

    }
}
