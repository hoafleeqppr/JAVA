import java.util.Scanner;

public class EXAMPLE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Electricity Unit : ");
        int unit = input.nextInt();
        int electricityBill, bill_electricity;
        if (unit <= 50) {
            electricityBill = unit * 1678;
        } else if (unit <= 100) {
            electricityBill = unit * 1734;
        } else if (unit <= 200) {
            electricityBill = unit * 2014;
        } else if (unit <= 300) {
            electricityBill = unit * 2536;
        } else if (unit <= 400) {
            electricityBill = unit * 2834;
        } else {
            electricityBill = unit * 2927;
        }
        bill_electricity = electricityBill;
        System.out.println("Total Electricity Bill : " + bill_electricity);
    }
}
