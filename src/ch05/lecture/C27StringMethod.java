package ch05.lecture;

public class C27StringMethod {
    public static void main(String[] args) {
        // replace: 특정 문자열을 지정한 문자열로 변경
        String a = "java hello world react jsp javascript spring";
        String b = a.replace("world", "세계");
        System.out.println("a = " + a);     // 원래 변수의 값은 변하지 않는다.
        System.out.println("b = " + b);

        String c = a.replace("java", "자바");
        System.out.println("c = " + c);

    }
}
