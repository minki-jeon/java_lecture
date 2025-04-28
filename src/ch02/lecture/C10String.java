package ch02.lecture;

public class C10String {
    public static void main(String[] args) {
        // 특수기호

        // \n : 새로운줄
        // \t : 띄어쓰기
        // \" : 큰따옴표
        // \\ : 역슬래시
        String a = "abc\ndef";
        System.out.println("a = " + a);
        a = "abc\tdef";
        System.out.println("a = " + a);
        a = "a\tbcdef";
        System.out.println("a = " + a);
        a = "\"java\"";
        System.out.println("a = " + a);
        a = "\\java\\";
        System.out.println("a = " + a);
    }
}
