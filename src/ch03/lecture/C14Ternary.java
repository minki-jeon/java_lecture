package ch03.lecture;

public class C14Ternary {
    public static void main(String[] args) {
        // 삼항연산자(Ternary)
        // 조건연산자(Conditional)
        // 항1(조건문) ? 항2(True 실행문) : 항3(False 실행문)

        int r1 = true ? 3 : 5;      // 3
        int r2 = false ? 9 : 11;    // 11
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }
}
