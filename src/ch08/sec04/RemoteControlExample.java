package ch08.sec04;

public class RemoteControlExample {
    //* Reference : [Book. 이것이 자바다] p.354
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc;

        // Television 객체 생성하고 인터페이스 변수 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // Audio 객체 생성하고 인터페이스 변수 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
