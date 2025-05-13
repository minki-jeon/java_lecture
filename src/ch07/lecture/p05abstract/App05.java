package ch07.lecture.p05abstract;

public class App05 {
    public static void main(String[] args) {
        String a = "java";
        Object b = a;               // 자동형변환

        int c = b.hashCode();       // 재정의된 String.hashCode() 실행
        System.out.println(c);
    }
}
