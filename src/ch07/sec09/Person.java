package ch07.sec09;

public class Person {
    //* Reference : [Book. 이것이 자바다] p.324
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("걷습니다.");
    }
}
