package ch17.exercise.p07;

public class Member {
    //* Reference : [Book. 이것이 자바다] p.775
    private String name;
    private String job;

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
