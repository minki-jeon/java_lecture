package leetcode.p2373;

import java.util.Arrays;

/**
 * <pre>
 * packageName    : leetcode.p2373
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-09-24 (수)
 * description    : 2373. Largest Local Values in a Matrix
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-09-24 (수)        minki-jeon       최초 생성
 * </pre>
 */
public class Solution {

    public static void main(String[] args) {
//        int[][] grid = new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        int[][] grid = new int[][]{
                {20, 8, 20, 6, 16, 16, 7, 16, 8, 10},
                {12, 15, 13, 10, 20, 9, 6, 18, 17, 6},
                {12, 4, 10, 13, 20, 11, 15, 5, 17, 1},
                {7, 10, 14, 14, 16, 5, 1, 7, 3, 11},
                {16, 2, 9, 15, 9, 8, 6, 1, 7, 15},
                {18, 15, 18, 8, 12, 17, 19, 7, 7, 8},
                {19, 11, 15, 16, 1, 3, 7, 4, 7, 11},
                {11, 6, 5, 14, 12, 18, 3, 20, 14, 6},
                {4, 4, 19, 6, 17, 12, 8, 8, 18, 8},
                {19, 15, 14, 11, 11, 13, 12, 6, 16, 19}
        };
        int[][] result = largestLocal(grid);
        System.out.println(Arrays.deepToString(result));
    }

    private static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];

        for (int i = 0; i < maxLocal.length; i++) {
            for (int j = 0; j < maxLocal[i].length; j++) {
                int max = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        max = Math.max(max, grid[k][l]);
                    }
                }
                maxLocal[i][j] = max;
            }
        }

        return maxLocal;
    }


}
