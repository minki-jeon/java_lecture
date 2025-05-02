package leetcode.p1572;

public class Solution {
    public int diagonalSum(int[][] mat) {
        //* (Way 1)
        int sum = 0;
        int a = 0;
        int b = mat[0].length - 1;
        for (int i = 0; i < mat.length; i++) {
            if (a == b) {
                sum = sum + mat[i][a];
            } else {
                sum = sum + mat[i][a] + mat[i][b];
            }
            a++;
            b--;
        }

        //* (Way 2)
        // int sum = 0;
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[i].length; j++) {
        //         if (i == j) {
        //             sum += mat[i][j];
        //         } else if ((i + j) == mat.length - 1) {
        //             sum += mat[i][j];
        //         }
        //     }
        // }

        //* (Way 3)
        // int sum = 0;
        // int red = 0;
        // int blue = mat.length - 1;
        // for (int i = 0; i < mat.length; i++) {
        //     sum += mat[i][red];
        //     sum += mat[i][blue];
        //     red++;
        //     blue--;
        // }
        // if (mat.length % 2 == 1) {
        //     int d = mat.length / 2;
        //     sum -= mat[d][d];
        // }

        return sum;
    }
}
