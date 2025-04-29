package ch02.lecture;

public class C17Concatenate {
    public static void main(String[] args) {
        // + : 문자열 연결 연산
        String a = "java";
        String b = "hello";

        String c = a + b; // a와 b를 연결
        System.out.println("c = " + c);             // "javahello"
        System.out.println("(a+b) = " + (a + b));   // "javahello"

        String d = "react";
        String e = a + b + d;
        System.out.println("e = " + e);     // "javahelloreact"
        String f = (a + b) + d;
        System.out.println("f = " + f);     // "javahelloreact"
        String g = a + (b + d);
        System.out.println("g = " + g);     // "javahelloreact"

        // 다른 타입과 문자열을 + 연산하면 연결 연산
        String h = "java";
        int i = 300;
        String j = h + i;   // "java300"
        System.out.println("j = " + j);

        String k = "500";
        int l = 400;
        String m = k + l;
        System.out.println("m = " + m);     // "500400"

        int n = 200;
        int o = 300;
        String p = "400";
        String q = n + o + p;
        System.out.println("q = " + q);     // "500400"

        String r = (n + o) + p;
        System.out.println("r = " + r);     // "500400"

        String s = n + (o + p);
        System.out.println("s = " + s);     // "200300400"
    }
}
