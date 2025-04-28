package ch02.sec05;

public class BooleanExample {
    //* Reference : [Book. 이것이 자바다] p.50
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("중지합니다");
        } else {
            System.out.println("시작합니다");
        }

        int x = 10;
        boolean result1 = (x == 20);        // 변수 x의 값이 20이면 true, 아니면 false
        boolean result2 = (x != 20);        // 변수 x의 값이 20이면 false, 아니면 true
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
