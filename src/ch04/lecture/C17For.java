package ch04.lecture;

public class C17For {
    public static void main(String[] args) {

        // 무한 반복
//        for (; ; ) {
//            System.out.println("반복 코드");
//        }

        int i = 0;
        for (; i < 3; i++) {
            System.out.println("코드 실행 a");
        }

        for (int j = 0; j < 3; ) {
            System.out.println("코드 실행 b");
        }

        for (int j = 0, k = 0; j < 3; j++, k++) {
            System.out.println("코드 실행 c");
        }
    }
}
