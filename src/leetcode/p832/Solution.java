package leetcode.p832;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int[][] result = new int[image.length][];
        for (int j = 0; j < image.length; j++) {
            int[] a = image[j];
            int[] b = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                b[i] = a[a.length - 1 - i];
            }
            result[j] = b;
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = 0;
                }
            }
        }

        return result;
    }
}
