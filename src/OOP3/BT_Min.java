package OOP3;

public class BT_Min {
    public static void main(String[] args) {
        int[] arrNum = {2, 5, 7, 3, 8, 10};
        int min = arrNum[0];
        for (int i = 1; i < arrNum.length; i++) {
            if (min > arrNum[i]) {
                min = arrNum[i];
            }
        }
        System.out.println("Số nhỏ nhất là :" + min);
    }
}