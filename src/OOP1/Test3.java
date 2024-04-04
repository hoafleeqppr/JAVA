package OOP1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số thay cho ngày : ");
        int status = sc.nextInt();

        switch (status) {
            case 1:
                System.out.println("One_day");
                break;
            case 2:
                System.out.println("Towr_day");
                break;
            case 3:
                System.out.println("Trere_day");
                break;
            case 5:
                System.out.println("Five_day");
                break;
            case 6:
                System.out.println("Six_day");
                break;
            case 7:
                System.out.println("Seven_day");
                break;

        }
    }
}
