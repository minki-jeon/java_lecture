package ch03.lecture;

public class C11Logical {
    public static void main(String[] args) {
        // 논리연산자 (&&, &, ||, |)
        // 피연산자 type + return type: boolean
        // 연산자 두개: Short-circuit 연산 동작한다.

        // and (&&, &): 두 피연산자가 true인 경우 true, 아니면 false
        System.out.println("(true && true) = " + (true && true));       // true
        System.out.println("(true && false) = " + (true && false));     // false
        System.out.println("(false && true) = " + (false && true));     // false
        System.out.println("(false && false) = " + (false && false));   // false

        System.out.println("(true & true) = " + (true & true));     // true
        System.out.println("(true & false) = " + (true & false));   // false
        System.out.println("(false & true) = " + (false & true));   // false
        System.out.println("(false & false) = " + (false & false)); // false

//        System.out.println("(0 && true) = " + (0 && true)); // error
//        System.out.println("(0 & true) = " + (0 & true));   // error
        System.out.println("(0 & 1) = " + (0 & 1));     // 비트 연산

        // or (||, |): 두 피연산자가 false인 경우 false, 아니면 true
        System.out.println("(true || true) = " + (true || true));       // true
        System.out.println("(true || false) = " + (true || false));     // true
        System.out.println("(false || true) = " + (false || true));     // true
        System.out.println("(false || false) = " + (false || false));   // false

        System.out.println("(true | true) = " + (true | true));         // true
        System.out.println("(true | false) = " + (true | false));       // true
        System.out.println("(false | true) = " + (false | true));       // true
        System.out.println("(false | false) = " + (false | false));     // false

        // 연습
        int x = 5;
        int y = 8;
        boolean r1 = (x > 5) && (y < 5);
        System.out.println("r1 = " + r1);       // false
        boolean r2 = (x > 5) || (y < 5);
        System.out.println("r2 = " + r2);       // false
    }
}
