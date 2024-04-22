package OOP3;

public class Bt_XoaPhanTu {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            newArray[i] = array[i + 1];
        }
        for (int i : newArray) {
            System.out.print(i + "  ");
        }
    }
}