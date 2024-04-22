package OOP3;

public class BT_ThemMang {

    public static void main(String[] args) {
        int[] array = {2, 1, 3, 5, 4};
        int add = 7;
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = add;
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}
