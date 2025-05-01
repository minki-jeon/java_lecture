package ch04.lecture;

public class C15For {
    public static void main(String[] args) {
        // while
        System.out.println(1);

        int count = 0;              // 카운트 변수 초기화
        while (count < 3) {         // 조건 확인
            System.out.println(2);
            System.out.println(3);

            count++;                // 카운트 변수 증가
        }
        System.out.println(4);
        System.out.println(5);

        System.out.println("---------------------");

        // for
        for (int i = 0; i < 3; i++) {
            System.out.println("반복하는 코드");
        }

        System.out.println("프로그램 종료");
    }
}
