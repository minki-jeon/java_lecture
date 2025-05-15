package ch12.lecture.p01object;

public class App04 {
    public static void main(String[] args) {
        String a = new String("java");
        String b = new String("java");

        System.out.println(a == b);         // 참조값 비교
        System.out.println(a.equals(b));    // 값(문자) 비교 - Object.equals 재정의 -> String.equals

    }
}
