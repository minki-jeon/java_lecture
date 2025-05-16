package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App03 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]", "q"));    // true
        // \w : [a-zA-Z0-9_]
        // 자바에서 ""안에 \는 \\로 작성
        System.out.println(Pattern.matches("\\w", "q"));            // true
        System.out.println(Pattern.matches("\\w\\w", "qq"));        // true
        System.out.println(Pattern.matches("\\w\\w\\w", "qqq"));    // true
        System.out.println(Pattern.matches("\\w\\w\\w", "qq"));     // false
    }
}
