package ch06.sec06.exam01;

public class CarExample {
    //* Reference : [Book. 이것이 자바다] p.217
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();
//        myCar.model = "tesla";
//        myCar.start = true;
//        myCar.speed = 100;

        // Car 객체의 필드값 읽기
        System.out.println("모델명: " + myCar.model);
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed);
    }
}
