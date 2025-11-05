
public class ContohExceptionDenganFinally {

    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi Exception karena Array melebihi kapasitas");
        } finally{
            System.out.println("Outputnya Finally");
        }
    }
}
