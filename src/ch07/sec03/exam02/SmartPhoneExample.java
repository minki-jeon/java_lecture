package ch07.sec03.exam02;

public class SmartPhoneExample {
    //* Reference : [Book. 이것이 자바다] p.294
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델: " + myPhone.getModel());
        System.out.println("색상: " + myPhone.getColor());
    }
}
