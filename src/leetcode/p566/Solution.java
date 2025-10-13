package leetcode.p566;

import java.util.Arrays;

/**
 * <pre>
 * packageName    : leetcode.p566
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-09-24 (수)
 * description    : 566. Reshape the Matrix
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-09-24 (수)        minki-jeon       최초 생성
 * </pre>
 */
public class Solution {

    public static void main(String[] args) {
        int[][] result = matrixReshape(new int[][]{{1, 2}, {3, 4}}, 4, 1);

        for (int[] row : result) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if ((mat.length * mat[0].length) != (r * c)) return mat;
        int[][] answer = new int[r][c];
        int row = 0;
        int col = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                answer[i][j] = mat[row][col];
                col++;
                if (col >= mat[0].length) {
                    col = 0;
                    row++;
                }
            }
        }
        return answer;
    }
}
