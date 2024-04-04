package OOP1;

import java.util.Scanner;

public class Translate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers, hanhchuc, hangdonvi;

        System.out.print("Nhập số : ");
        numbers = sc.nextInt();

        if (0 < numbers && numbers < 10) {
            switch (numbers) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }

        if (numbers >= 10 && numbers < 100) {
            hanhchuc = numbers / 10;
            hangdonvi = numbers % 10;
            switch (hanhchuc) {
                case 1:
                    switch (hangdonvi) {
                        case 0:
                            System.out.println("Ten");
                            break;
                        case 1:
                            System.out.println("Eleven");
                            break;
                        case 2:
                            System.out.println("Twelve");
                            break;
                        case 3:
                            System.out.println("Thirteen");
                            break;
                        case 4:
                            System.out.println("Fourteen");
                            break;
                        case 5:
                            System.out.println("Fifteen");
                            break;
                        case 6:
                            System.out.println("Sixteen");
                            break;
                        case 7:
                            System.out.println("Seventeen");
                            break;
                        case 8:
                            System.out.println("Eighteen");
                            break;
                        case 9:
                            System.out.println("Nineteen");
                            break;
                    }
                    break;
                //còn mấy phần sau tương tự

                default:
                    System.out.println("Vượt quá giới hạn !");
                    break;
            }
        }
    }

}
