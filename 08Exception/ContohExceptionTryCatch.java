public class ContohExceptionTryCatch {
    public static void main(String[] args) {
        int bil = 10;
        String b []= {"A","B","C"};
        try{
            System.out.println(bil/0);
            System.out.println(b[3]);
        }
        catch(ArithmeticException e){
            System.out.println("Error Aritmetik");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error Array Melebihi Kapasitas");
        }
        catch(Exception e){
            System.out.println("Terjadi Error");
        }
    }
}
