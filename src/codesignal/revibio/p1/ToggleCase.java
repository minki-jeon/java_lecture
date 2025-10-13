package codesignal.revibio.p1;

/**
 * <pre>
 * packageName    : codesignal.revibio.p1
 * fileName       : ToggleCase
 * author         : minki-jeon
 * date           : 2025-09-29 (월)
 * description    :
 * ===========================================================
 * DATE                     AUTHOR           NOTE
 * -----------------------------------------------------------
 * 2025-09-29 (월)        minki-jeon       최초 생성
 * </pre>
 */
public class ToggleCase {
    public static String toggleCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        System.out.println(toggleCase(input)); // 출력: hELLO, wORLD!
    }
}
