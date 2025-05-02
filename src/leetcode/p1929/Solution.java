package leetcode.p1929;

public class Solution {
    public int[] getConcatenation(int[] nums) {
        //* (Way 1)
        int[] ans = new int[nums.length * 2];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(ans, 0, ans, nums.length, nums.length);

        //* (Way 2)
        // int len = nums.length;
        // int[] ans = new int[len * 2];
        // for (int i = 0; i < len; i++) {
        //     ans[i] = nums[i];
        //     ans[i + len] = nums[i];
        // }

        //* (Way 3)
        // int[] ans = new int[nums.length * 2];
        // for (int i = 0; i < nums.length; i++) {
        //     ans[i] = nums[i];
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     ans[i + nums.length] = nums[i];
        // }

        return ans;
    }
}
