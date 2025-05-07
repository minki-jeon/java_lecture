package ch05.lecture;

public class C22String {
    public static void main(String[] args) {
        // 9번째 기본타입 -> 참조타입이지만 new 생략해서 기본타입처럼 사용 가능
        String a = "java";      // new String 생략
        String f = "java";      // new String 생략
        System.out.println(a == f);     // true

        String g = "ja";
        String h = "va";
        String i = g + h;
        System.out.println(a == i);     // false


        // 참조타입 String
        String b = new String("java");
        String c = new String("react");
        System.out.println(b == c);     // false

        String d = new String("java");
        String e = new String("java");
        System.out.println(d == e);     // false

        // 즉, 문자열의 내용이 같은지 확인할 때는
        // equals() 메소드 사용해야 한다.
    }
}
