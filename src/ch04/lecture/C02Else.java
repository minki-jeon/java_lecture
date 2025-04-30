package ch04.lecture;

public class C02Else {
    public static void main(String[] args) {
        // else : if의 조건이 false일 때 실행되는 코드 블럭
        if (true) {
            System.out.println("if true 실행 코드");
        } else {
            System.out.println("if true else 실행 코드");
        }

        if (false) {
            System.out.println("if false 실행 코드");
        } else {
            System.out.println("if false else 실행 코드");
        }

    }
}
