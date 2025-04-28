package ch02.lecture;

import static java.lang.StringTemplate.STR;

public class C12String {
    public static void main(String[] args) {
        // String Templete : 21버전에서 실험적으로 기능 추가, 23버전에서 삭제

        int x = 20;
        String s = STR."The value is \{x} !!";
        System.out.println(s);

    }
}
