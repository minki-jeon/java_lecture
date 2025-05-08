package ch06.sec08.exam04;

import ch06.sec08.exam04.Calculator;

public class CalculatorExample {
    //* Reference : [Book. 이것이 자바다] p.243
    public static void main(String[] args) {
        // 객체 생성
        Calculator myCalcu = new Calculator();

        // 정사각형의 넓이
        double result1 = myCalcu.areaRectangle(10);

        // 직사각형의 넓이
        double result2 = myCalcu.areaRectangle(10, 20);

        System.out.println("정사각형 넓이 = " + result1);
        System.out.println("직사각형 넓이 = " + result2);
    }
}
