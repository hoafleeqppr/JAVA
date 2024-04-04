package OOP1;

import java.util.Scanner;

public class HocLuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double chuyencan, kiemtra, cuoiki, trungbinh ;

        System.out.print("Hãy nhập điểm chuyên cần : ");
        chuyencan = sc.nextDouble();

        System.out.print("Hãy nhập điểm kiểm tra : ");
        kiemtra = sc.nextDouble();

        System.out.print("Hãy nhập điểm cuối kì : ");
        cuoiki = sc.nextDouble();

        trungbinh = (chuyencan + kiemtra + cuoiki) / 3;
        System.out.println("Điểm trung bình của bạn là : " + trungbinh );

        if (trungbinh >= 8.5){
            System.out.print("Xếp loại A");
        }
        else if (7 <= trungbinh && trungbinh < 8.5 ){
            System.out.print("Xếp loại B");
        }
        else if (5.5 <= trungbinh && trungbinh < 7 ){
            System.out.print("Xếp loại C");
        }
        else if (4 <= trungbinh && trungbinh < 5.5 ){
            System.out.print("Xếp loại D");
        }
        else {
            System.out.print("Xếp loại F");
        }
    }
}
