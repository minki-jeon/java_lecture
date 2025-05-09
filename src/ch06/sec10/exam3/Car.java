package ch06.sec10.exam3;

public class Car {    //* Reference : [Book. 이것이 자바다] p.253
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    static void simulate() {
        // instance
        Car myCar = new Car();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        // static(정적) method 호출
        simulate();
//        speed = 70;   // instance 접근 불가

        // instance 멤버
        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
