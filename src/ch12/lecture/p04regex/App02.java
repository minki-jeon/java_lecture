package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("a", "a"));      // true
        System.out.println(Pattern.matches("a", "b"));      // false

        // [] : character class
        // [ab] : a 또는 b
        System.out.println(Pattern.matches("[ab]", "a"));      // true
        System.out.println(Pattern.matches("[ab]", "b"));      // true
        System.out.println(Pattern.matches("[ab]", "ab"));      // false
        System.out.println(Pattern.matches("[ab][ab]", "ab"));      // true
        System.out.println(Pattern.matches("[ab][ab]", "aa"));      // true
        System.out.println(Pattern.matches("[ab][ab]", "bb"));      // true
        System.out.println(Pattern.matches("[ab][ab]", "ba"));      // true

        // [a-e] : a 부터 e까지 (범위)
        System.out.println(Pattern.matches("[a-e]", "a"));      // true
        System.out.println(Pattern.matches("[a-e]", "b"));      // true
        System.out.println(Pattern.matches("[a-e]", "e"));      // true
        System.out.println(Pattern.matches("[a-z]", "o"));      // true
        System.out.println(Pattern.matches("[A-Z]", "G"));      // true
        System.out.println(Pattern.matches("[A-Z]", "g"));      // false
        System.out.println(Pattern.matches("[0-9]", "3"));      // true
        // 대문자+소문자+숫자 범위 내
        System.out.println(Pattern.matches("[0-9A-Za-z]", "7"));      // true
        System.out.println(Pattern.matches("[0-9A-Za-z]", "t"));      // true
        System.out.println(Pattern.matches("[0-9A-Za-z]", "v"));      // true
        //한글
        System.out.println(Pattern.matches("[가-힣]", "손"));      // true
        System.out.println(Pattern.matches("[가-힣]", "발"));      // true
        // 한글+영문+숫자
        System.out.println(Pattern.matches("[가-힣0-9a-zA-Z]", "발"));      // true


    }
}
