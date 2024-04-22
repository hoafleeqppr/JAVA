package OOP3;

import java.util.Arrays;

public class BT_GopMang {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int length = arr1.length + arr2.length;
        int[] arrSum = new int[length];
        int i = 0;
        for (int element : arr1) {
            arrSum[i] = element;
            i++;
        }
        for (int element : arr2) {
            arrSum[i] = element;
            i++;
        }
        System.out.println(Arrays.toString(arrSum));
    }
}
