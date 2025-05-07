package leetcode.p1108;

public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
