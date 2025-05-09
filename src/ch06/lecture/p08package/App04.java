package ch06.lecture.p08package;

import ch06.lecture.p08package.sub1.MyClass01;

import java.util.Scanner;
// java.lang 패키지는 import도 생략가능
//import java.lang.String;
//import java.lang.System;

public class App04 {
    public static void main(String[] args) {

        // 다른 패키지에 있는 클래스는 full-name 사용해야한다.
        //  => import하면 생략 가능
        MyClass01 a = new MyClass01();

        // 예제 java.util.Scanner
//        java.util.Scanner scanner = new Scanner(java.lang.System.in);
        Scanner scanner = new Scanner(System.in);

        // 예제 String
//        java.lang.String s = "java";
        String s = "java";
    }
}
