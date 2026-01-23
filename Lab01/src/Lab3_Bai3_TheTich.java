import java.util.Scanner;
public class Lab3_Bai3_TheTich {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();

        double theTich = Math.pow(canh, 3);

        System.out.println("Thể tích khối lập phương: " + theTich);

    }
}
