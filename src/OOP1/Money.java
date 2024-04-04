package OOP1;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the USD amount : ");
        double number = sc.nextInt();

        double usd = 23.000;

        System.out.print(number + " USD = " + (number * usd) + " Vnđ" );
    }
}
