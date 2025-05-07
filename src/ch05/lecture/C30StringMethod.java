package ch05.lecture;

public class C30StringMethod {
    public static void main(String[] args) {
        // trim, strip : 끝의 빈문자(white space) 삭제
        String a = "    hello world    ";
        System.out.println("a = " + a);
        String b = a.trim();
        System.out.println("b = " + b);

        // Java 11 버전부터 추가 (모든 유니코드 공백 포함 제거)
        String c = a.strip();
        System.out.println("c = " + c);

        String z = "\u2002Hello\u2002";
        String x = z.trim();
        String y = z.strip();
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
