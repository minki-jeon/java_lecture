package ch12.exercise.p17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    //* Reference : [Book. 이것이 자바다] p.568
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp = "[a-zA-Z]\\w{7,11}";
        boolean isMatch = Pattern.matches(regExp, id);
        if (isMatch) {
            System.out.println("ID로 사용할 수 있습니다.");
        } else {
            System.out.println("ID로 사용할 수 없습니다.");
        }
    }
}
