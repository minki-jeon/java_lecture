package ch12.exercise.p06;

public class Member {
    //* Reference : [Book. 이것이 자바다] p.565
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
