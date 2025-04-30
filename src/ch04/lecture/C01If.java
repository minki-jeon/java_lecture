package ch04.lecture;

public class C01If {
    public static void main(String[] args) {
        // if : 조건문(분기문, branch, condition)
        // ({조건문}) 이 truue이면 코드블럭 실행
        if (true) {
            System.out.println("실행 코드 블럭");
        }
        if (false) {
            System.out.println("실행 코드 블럭");
        }
        // truthy, falsy 적용되지 않음
//        if (3) {
//            System.out.println("실행 코드 블럭");
//        }
    }
}
