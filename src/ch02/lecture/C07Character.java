package ch02.lecture;

public class C07Character {
    public static void main(String[] args) {
        // char: 문자형(character)
        // 하나의 문자를 저장하는 자료형
        // 2bytes, 16bit

        // 문자 literal : 작은 따옴표로 표시
        char a;
        a = 'a';
        System.out.println("a = " + a);
        a = 'b';
        System.out.println("a = " + a);
        a = 'c';
        System.out.println("a = " + a);
        a = 'x';
        System.out.println("a = " + a);
        a = 'y';
        System.out.println("a = " + a);
        a = 'z';
        System.out.println("a = " + a);
        a = '가';
        System.out.println("a = " + a);
        a = '한';
        System.out.println("a = " + a);

        a = '\ud55c';
        System.out.println("a = " + a);
        a = '\u2669';
        System.out.println("a = " + a);

//        a = '한글'; // Error
//        a = ''; // Error
        a = ' '; // ok
        System.out.println("a = " + a);

        int b = '한';
        System.out.println("b = " + b);

    }
}
