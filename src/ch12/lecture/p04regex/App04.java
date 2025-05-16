package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App04 {
    public static void main(String[] args) {
        // {n,m} : n개에서 m개까지의 개수

        System.out.println(Pattern.matches("\\w{2,4}", "a0_"));     // true
        System.out.println(Pattern.matches("\\w{2,4}", "9Aw"));     // true
        System.out.println(Pattern.matches("\\w{2,4}", "9Awq"));    // true
        System.out.println(Pattern.matches("\\w{2,4}", "9A"));      // true
        System.out.println(Pattern.matches("\\w{2,4}", "9"));       // false
        System.out.println(Pattern.matches("\\w{2,4}", "99calq"));  // false

        // {n} : 정확히 n개
        // {n,} : n개 이상
        System.out.println(Pattern.matches("\\w{2}", "9c"));  // true
        System.out.println(Pattern.matches("\\w{2}", "9c"));  // true
        System.out.println(Pattern.matches("\\w{2}", "9c"));  // true
        System.out.println(Pattern.matches("\\w{2}", "9c"));  // true


    }
}
