package ch07.sec02;

public class SmartPhone extends Phone {
    //* Reference : [Book. 이것이 자바다] p.288

    public boolean wifi;

    public SmartPhone(String model, String color) {
        // 상속받은 필드값 설정
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}
