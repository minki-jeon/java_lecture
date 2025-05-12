package ch07.sec04.exam01;

public class Computer extends Calculator {
    //* Reference : [Book. 이것이 자바다] p.296
    @Override
    public double areaCirCle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
