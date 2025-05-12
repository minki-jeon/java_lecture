package ch07.sec10.exam02;

public abstract class Animal {
    //* Reference : [Book. 이것이 자바다] p.330
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();
}
