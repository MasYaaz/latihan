import java.util.Scanner;

public class ContohIfElseNested {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Inputkan Nilai:");
            int nilai = scan.nextInt();
            if (nilai >= 10) {
                if (nilai >=15){
                    System.out.println("A");
                }
                else if(nilai >=20) {
                    System.out.println("B");
                }
                else if(nilai >=30) {
                    System.out.println("C");
                }
        }
        else{
            System.out.println("Inputan tidak masuk range");
        }
    }
}
}