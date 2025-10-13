package codesignal.revibio.p2;

/**
 * <pre>
 * packageName    : codesignal.revibio.p2
 * fileName       : CountNoHighest
 * author         : minki-jeon
 * date           : 2025-09-29 (월)
 * description    :
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-09-29 (월)        minki-jeon       최초 생성
 * </pre>
 */
public class CountNoHighest {
    public static int countNoHighest(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxFromRight = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] >= maxFromRight) {
                count++;
                maxFromRight = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 5, 7, 4, 9, 2, 3, 3, 6};
        System.out.println(countNoHighest(nums1)); // 출력: 2 (9, 6)

        int[] nums2 = {5, 5, 5, 5};
        System.out.println(countNoHighest(nums2)); // 출력: 4 (5,5,5,5)

        int[] nums3 = {95, 36, 77, 32, 55, 81, 44, 30};
        System.out.println(countNoHighest(nums3)); // 출력: 4 (95, 81, 44, 30)

        int[] nums4 = {1031, 999, 1765, 1914, 1516, 1475, 999, 234, 1010};
        System.out.println(countNoHighest(nums4)); // 출력: 4 (95, 81, 44, 30)
    }
}
