package leetcode.p125;

public class Solution {
    public boolean isPalindrome(String s) {
        // (Way 1)
        String match = "[^0-9a-zA-Z]";
        s = s.replaceAll(match, " ");
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();

        if ("".equals(s)) return true;
        boolean isPalindrome = true;

        char[] ch = s.toCharArray();
        for (int i = 0, j = ch.length - 1; i <= j; i++, j--) {
            if (ch[i] != ch[j]) isPalindrome = false;
        }


        // (Way 2)
//        boolean isPalindrome = true;
//
//        String t = s.toLowerCase();
//
//        int red = 0;
//        int blue = t.length() - 1;
//
//        while (red < blue) {
//            while (red < t.length() && !(('a' <= t.charAt(red) && t.charAt(red) <= 'z')
//                    || ('0' <= t.charAt(red) && t.charAt(red) <= '9'))) {
//                red++;
//            }
//            while (blue > 0 && !(('a' <= t.charAt(blue) && t.charAt(blue) <= 'z')
//                    || ('0' <= t.charAt(blue) && t.charAt(blue) <= '9'))) {
//                blue--;
//            }
//
//            if (!(red < t.length() && blue > 0)) {
//                break;
//            }
//
//            if (t.charAt(red) != t.charAt(blue)) {
//                isPalindrome = false;
//            }
//
//            red++;
//            blue--;
//        }

        return isPalindrome;
    }
}
