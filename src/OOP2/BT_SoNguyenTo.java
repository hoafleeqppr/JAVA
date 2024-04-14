package OOP2;

import java.util.Scanner;

public class BT_SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = scanner.nextInt();
        System.out.printf("%d Prime number is : \n", number);
        int count = 0;
        int N = 2;
        while (count < number) {
            if (isPrimeNumber(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;

        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int N = 2; N <= squareRoot; N++) {
            if (number % N == 0) {
                return false;
            }
        }
        return true;
    }
}


