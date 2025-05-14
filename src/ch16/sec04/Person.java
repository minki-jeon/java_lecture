package ch16.sec04;

public class Person {
    //* Reference : [Book. 이것이 자바다] p.707
    public void action(Calcuable calcuable) {
        double result = calcuable.calc(10, 4);
        System.out.println("결과: " + result);
    }
}
