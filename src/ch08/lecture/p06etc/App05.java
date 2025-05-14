package ch08.lecture.p06etc;

public class App05 {
//    MyInterface05.common();     // private 설정하여 접근하지 못하도록 한다.
}

interface MyInterface05 {
    static void action1() {
        System.out.println("MyInterface05.action1");
        common();
    }

    static void action2() {
        System.out.println("MyInterface05.action2");
        common();
    }

    // private static method
    private static void common() {
        System.out.println("매우 긴~ 코드");
    }
}
