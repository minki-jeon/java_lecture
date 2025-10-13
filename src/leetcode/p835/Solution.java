package leetcode.p835;

/**
 * <pre>
 * packageName    : leetcode.p835
 * fileName       : Solution
 * author         : minki-jeon
 * date           : 2025-09-24 (수)
 * description    : 835. Image Overlap
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-09-24 (수)        minki-jeon       최초 생성
 * </pre>
 */
public class Solution {
    public static void main(String[] args) {
        int[][] img1 = {{1, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int[][] img2 = {{0, 0, 0}, {0, 1, 1}, {0, 0, 1}};

        int result = largestOverlap(img1, img2);
        System.out.println(result);

    }

    private static int largestOverlap(int[][] img1, int[][] img2) {
        /**
         *  TODO 문제 해결 방법 이해 필요
         *  [Solutions] java - easy to understand solution @ZX007java
         */
        int ans = 0, n = img1.length, lim = n + n - 1;

        int t[][] = new int[n + n + n - 2][n + n + n - 2];

        for (int i = 0, r = n - 1; i != n; i++, r++)
            for (int j = 0, c = n - 1; j != n; j++, c++)
                t[r][c] = img1[i][j];


        for (int y = 0; y != lim; y++)
            for (int x = 0; x != lim; x++) {
                int tmp = 0;

                for (int i = 0, r = y; i != n; i++, r++)
                    for (int j = 0, c = x; j != n; j++, c++)
                        tmp += img2[i][j] & t[r][c];

                if (tmp > ans) ans = tmp;
            }

        return ans;
    }
}
