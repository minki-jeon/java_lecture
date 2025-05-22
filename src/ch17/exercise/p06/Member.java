package ch17.exercise.p06;

public class Member {
    //* Reference : [Book. 이것이 자바다] p.774
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
