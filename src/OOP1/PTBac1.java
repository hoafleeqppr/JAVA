package OOP1;

import java.util.Scanner;

public class PTBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a = ");
        double a = sc.nextDouble();

        System.out.print("Nhập b = ");
        double b = sc.nextDouble();

        System.out.print("Nhập c = ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.print("Phương trình vô nghiệm !");
        } else {
            System.out.print("Phương trình có nghiệm x = " + ((-b + c) / a));
        }
    }
}
