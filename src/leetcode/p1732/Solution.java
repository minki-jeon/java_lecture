package leetcode.p1732;

public class Solution {
    public int largestAltitude(int[] gain) {
        //* (Way 1)
        int highest = 0;
        int[] altitudes = new int[gain.length + 1];

        int sum = 0;
        altitudes[0] = 0;
        for (int i = 1; i < altitudes.length; i++) {
            sum += gain[i - 1];
            altitudes[i] = sum;
        }

        for (int n : altitudes) {
            if (n > highest) highest = n;
        }

        //* (Way 2)
        // int sum = 0;
        // int highest = 0;

        // for (int g : gain) {
        //     sum += g;
        //     if (sum > highest) {
        //         highest = sum;
        //     }
        // }

        return highest;
    }
}
