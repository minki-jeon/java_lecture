package ch04.lecture;

public class C22Break {
    public static void main(String[] args) {
        // break : 반복문(for, while) 종료

        while (true) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            if (true) {
                break; // 반복문 종료
            }
            System.out.println(4);
        }
        System.out.println(5);
    }
}
