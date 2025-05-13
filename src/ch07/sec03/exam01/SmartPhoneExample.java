package ch07.sec03.exam01;

public class SmartPhoneExample {
    //* Reference : [Book. 이것이 자바다] p.292
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }
}
