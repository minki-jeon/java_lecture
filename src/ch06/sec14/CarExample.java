package ch06.sec14;

public class CarExample {
    //* Reference : [Book. 이것이 자바다] p.274
    public static void main(String[] args) {
        Car myCar = new Car();

        // 잘못된 속도 변경
        myCar.setSpeed(-50);
        System.out.println("현재 속도: " + myCar.getSpeed());

        // 올바른 속도 변경
        myCar.setSpeed(60);
        System.out.println("현재 속도: " + myCar.getSpeed());

        // 멈춤
        if (!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println("현재 속도: " + myCar.getSpeed());
    }
}
