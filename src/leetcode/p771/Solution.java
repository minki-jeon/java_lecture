package leetcode.p771;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // (Way 1)
        char[] st = stones.toCharArray();
        int count = 0;
        for (char c : st) {
            String str = c + "";
            if (jewels.contains(str)) count++;
        }

        // (Way 2)
//        int count = 0;
//        for (int j = 0; j < stones.length(); j++) {
//            char stone = stones.charAt(j);
//            for (int i = 0; i < jewels.length(); i++) {
//                if (jewels.charAt(i) == stone) {
//                    count++;
//                }
//            }
//        }

        return count;
    }
}
