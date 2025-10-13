package codesignal.revibio.p3;

/**
 * <pre>
 * packageName    : codesignal.revibio.p3
 * fileName       : YPattern
 * author         : minki-jeon
 * date           : 2025-09-29 (월)
 * description    :
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-09-29 (월)        minki-jeon       최초 생성
 * </pre>
 */

public class YPattern {
    public static int minChangesToY(int[][] grid) {
        int n = grid.length;
        int changeY = 0;           // Y 좌표를 2로 바꾸는 횟수
        int changeOthersTo0 = 0;   // 나머지를 모두 0으로 만드는 경우
        int changeOthersTo1 = 0;   // 나머지를 모두 1로 만드는 경우

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isY =
                        (i <= n / 2 && (j == i || j == n - 1 - i)) || // 위쪽 대각선
                                (i >= n / 2 && j == n / 2);                   // 아래쪽 세로

                if (isY) {
                    if (grid[i][j] != 2) changeY++; // Y는 무조건 2
                } else {
                    if (grid[i][j] != 0) changeOthersTo0++; // 0으로 통일
                    if (grid[i][j] != 1) changeOthersTo1++; // 1로 통일
                }
            }
        }

        return changeY + Math.min(changeOthersTo0, changeOthersTo1);
    }

    public static void main(String[] args) {
        int[][] grid1 = {
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };
        int[][] grid2 = {
                {2, 1, 2},
                {1, 2, 0},
                {1, 1, 1}
        };
        int[][] grid3 = {
                {2, 0, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] grid4 = {
                {2, 0, 1, 0, 1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0, 1, 0, 2, 0},
                {0, 0, 2, 0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 0, 2, 1, 0, 0},
                {0, 0, 0, 0, 2, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 1, 0, 2, 0, 1, 0, 0},
                {0, 0, 1, 0, 2, 0, 1, 0, 0},
                {0, 0, 0, 0, 2, 0, 0, 0, 0}
        };
        System.out.println(minChangesToY(grid4)); // 출력: 최소 변경 횟수
    }
}

