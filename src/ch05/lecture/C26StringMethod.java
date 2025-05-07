package ch05.lecture;

public class C26StringMethod {
    public static void main(String[] args) {
        // indexOf : 특정 문자열의 첫번째 위치(인덱스 번호)를 리턴
        String a = "hello java hello spring hello react";
        int b = a.indexOf("java");
        System.out.println("b = " + b);     // 6
        int c = a.indexOf("hello");
        System.out.println("c = " + c);     // 0
        int d = a.indexOf("jsp");
        System.out.println("d = " + d);     // -1

        // contains : 특정 문자열이 있는지 확인
        boolean e = a.contains("java");
        System.out.println("e = " + e);     // true
        boolean f = a.contains("ring");
        System.out.println("f = " + f);     // true
        boolean g = a.contains("jsp");
        System.out.println("g = " + g);     // false

        // startsWith : 특정 문자열로 시작하는지 확인
        boolean h = a.startsWith("hello");
        System.out.println("h = " + h);         // true
        boolean i = a.startsWith("hell");
        System.out.println("i = " + i);         // true
        boolean j = a.startsWith("heaven");
        System.out.println("j = " + j);         // false

        // endsWith : 특정 문자열로 종료되는지 확인
        boolean k = a.endsWith("react");
        System.out.println("k = " + k);         // true
        boolean l = a.endsWith("act");
        System.out.println("l = " + l);         // true
        boolean m = a.endsWith("stop");
        System.out.println("m = " + m);         // false

        // lastIndexOf : 특정 문자열의 마지막 위치 (인덱스 번호) 리턴
        int n = a.lastIndexOf("hello");
        System.out.println("n = " + n);         // 24
        int o = a.lastIndexOf("jsp");
        System.out.println("o = " + o);         // -1


    }
}
