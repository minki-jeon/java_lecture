package ch04.lecture;

public class C03ElseIf {
    public static void main(String[] args) {
        // else if : 이전 조건들이 false일 때 조건을 확인해서 true인 경우 코드블럭 실행
        if (false) {
            System.out.println("코드실행 1");
        } else if (false) {
            System.out.println("코드실행 2");
        } else if (false) {
            System.out.println("코드실행 3");
        } else if (false) {
            System.out.println("코드실행 4");
        } else {
            // 위의 조건이 모두 false인 경우 실행되는 영역
            System.out.println("코드실행 5");
        }
    }
}
