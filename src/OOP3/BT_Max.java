package OOP3;

public class BT_Max {
    public static void main(String[] args) {
        int[][] arrNum = {
                {1, 6, 8},
                {4, 7, 10},
        };
        int max = arrNum[0][0];
        for (int i = 0; i < arrNum.length; i++) {
            for (int j = 0; j < arrNum[i].length; j++) {
                if (max < arrNum[i][j]) {
                    max = arrNum[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất là:" + max);
    }
}

