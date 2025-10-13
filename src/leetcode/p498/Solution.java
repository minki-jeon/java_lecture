package leetcode.p498;

import java.util.Arrays;

/**
 * <pre>
 * packageName    : leetcode.p498
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-09-24 (수)
 * description    : 498. Diagonal Traverse
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-09-24 (수)        minki-jeon       최초 생성
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = findDiagonalOrder(mat);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] answer = new int[m * n];
        int row = 0;
        int col = 0;

        for (int i = 0; i < m * n; i++) {
            answer[i] = mat[row][col];

            if ((row + col) % 2 == 0) {
                // 행+열 = 짝수 : 오른쪽 위로
                if (col == n - 1) row++;        // 오른쪽 끝이면 아래로
                else if (row == 0) col++;       // 맨 위면 오른쪽으로
                else {
                    row--;
                    col++;
                }
            } else {
                // 행+열 = 홀수 : 왼쪽 아래로
                if (row == m - 1) col++;        // 맨 아래면 오른쪽로
                else if (col == 0) row++;       // 왼쪽 끝이면 아래로
                else {
                    row++;
                    col--;
                }
            }
        }

        return answer;
    }
}
