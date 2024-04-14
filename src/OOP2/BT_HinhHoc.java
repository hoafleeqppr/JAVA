package OOP2;

import java.util.Scanner;

public class BT_HinhHoc {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                int height;
                int width;
                int i;
                Scanner sc = new Scanner(System.in);

                System.out.print("height = ");
                height = sc.nextInt();
                System.out.print("width = ");
                width = sc.nextInt();

                for (i = 1; i <= height; i++) {
                    for (int j = 1; j <= width; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                Scanner sc1 = new Scanner(System.in);
                int height2;
                int a;
                int b;
                System.out.print("\n\n Nhap vao chieu cao cua tam giac: ");
                height2 = sc1.nextInt();
                for (a = 1; a <= height2; ++a) {
                    for (b = 1; b <= a; ++b) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                Scanner sc3 = new Scanner(System.in);
                int height3, k = 0;
                System.out.printf("\n\n Nhap vao chieu cao cua tam giac: ");
                height3 = sc3.nextInt();
                for (int c = 1; c <= height3; ++c, k = 0) {
                    for (int space = 1; space <= height3 - c; ++space) {
                        System.out.print("  ");
                    }
                    while (k != 2 * c - 1) {
                        System.out.print("* ");
                        ++k;
                    }
                    System.out.println();
                }
                break;
        }
    }
}
