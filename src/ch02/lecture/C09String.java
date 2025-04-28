package ch02.lecture;

public class C09String {
    public static void main(String[] args) {
        // String : 문자열

        // 문자열 literal : 큰 따옴표 사용 ""

        String a;
        a = "hello";
        System.out.println("a = " + a);
        a = "hi";
        System.out.println("a = " + a);
        a = "java";
        System.out.println("a = " + a);
        a = "한글";
        System.out.println("a = " + a);
        a = "한java글";
        System.out.println("a = " + a);
        a = "❤️ 한글";
        System.out.println("a = " + a);

        a = "가";
        System.out.println("a = " + a);
//        a = '가'; // 서로 다른 타입이어서 안됨
        a = ""; // 빈문자열 가능
        System.out.println("a = " + a);
    }
}
