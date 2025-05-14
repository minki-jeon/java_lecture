package ch08.sec06;

public class RemoteControlExample {
    //* Reference : [Book. 이것이 자바다] p.360
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        // 정적 메소드 호출
        RemoteControl.changeBattery();
    }
}
