package ch04.lecture;

public class C04Nested {
    public static void main(String[] args) {
        if (true) {
            if (true) {
                System.out.println("실행코드 1");
            } else {
                System.out.println("실행코드 2");
            }
        } else {
            if (true) {
                System.out.println("실행코드 3");
            } else {
                System.out.println("실행코드 4");
            }
        }
    }
}
