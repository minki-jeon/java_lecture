package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane {
    //* Reference : [Book. 이것이 자바다] p.299
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            // Airplane 객체의 fly() 호출
            super.fly();
        }
    }
}
