package ch03.sec10;

public class AssignmentOperatorExample {
    //* Reference : [Book. 이것이 자바다] p.105
    public static void main(String[] args) {
        int result = 0;
        result += 10;
        System.out.println("result = " + result);
        result -= 5;
        System.out.println("result = " + result);
        result *= 3;
        System.out.println("result = " + result);
        result /= 5;
        System.out.println("result = " + result);
        result %= 3;
        System.out.println("result = " + result);
    }
}
