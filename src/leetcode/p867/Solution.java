package leetcode.p867;

public class Solution {
    public int[][] transpose(int[][] matrix) {
        //* (Way 1)
        int[][] result = new int[matrix[0].length][];

        for (int i = 0; i < result.length; i++) {
            result[i] = new int[matrix.length];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix[j][i];
            }
        }

        //* (Way 2)
        // int[][] result = new int[matrix[0].length][matrix.length];
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         result[j][i] = matrix[i][j];
        //     }
        // }

        return result;
    }
}
