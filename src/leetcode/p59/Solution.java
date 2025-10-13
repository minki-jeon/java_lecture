package leetcode.p59;

/**
 * <pre>
 * packageName    : leetcode.p59
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-09-24 (수)
 * description    : 59. Spiral Matrix Ⅱ
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-09-24 (수)        minki-jeon       최초 생성
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int[][] result = generateMatrix(n);

        for (int[] row : result) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;

        while (left <= right && top <= bottom) {

            // Top col
            for (int i = left; i <= right; i++) {
                answer[top][i] = num++;
            }
            top++;

            // right row
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                // bottom col
                for (int i = right; i >= left; i--) {
                    answer[bottom][i] = num++;
                }
            }
            bottom--;

            if (left <= right) {
                // left row
                for (int i = bottom; i >= top; i--) {
                    answer[i][left] = num++;
                }
            }
            left++;
        }

        return answer;
    }
}
