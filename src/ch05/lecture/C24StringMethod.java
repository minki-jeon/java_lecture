package ch05.lecture;

public class C24StringMethod {
    public static void main(String[] args) {
        // java의 String은 불변(immutable)

        // to 대문자
        String a = "Hello World";
        String b = a.toUpperCase();
        System.out.println("a = " + a);     // Hello World
        System.out.println("b = " + b);     // HELLO WORLD

        // to 소문자
        String c = a.toLowerCase();
        System.out.println("a = " + a);     // Hello World
        System.out.println("c = " + c);     // hello world
    }
}
