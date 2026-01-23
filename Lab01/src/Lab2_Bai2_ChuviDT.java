import java.util.Scanner;

public class Lab2_Bai2_ChuviDT {
    public static void main(String[] args){
        Scanner sacnner = new Scanner(System.in);

        System.out.println("Nhập chiều dài: ");
        double dai = sacnner.nextDouble();

        System.out.println("Nhập chiều rộng: ");
        double rong = sacnner.nextDouble();

        double ChuVi = (dai + rong) * 2;
        double DienTich = dai * rong;
        double CanhNho = Math.min(dai, rong);

        System.out.println("Chu vi bằng: " + ChuVi);
        System.out.println("Diện tích bằng: " + DienTich);
        System.out.println("Cạnh nhỏ bằng: " + CanhNho);
    }

}
