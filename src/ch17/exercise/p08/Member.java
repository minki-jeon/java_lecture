package ch17.exercise.p08;

public class Member {
    //* Reference : [Book. 이것이 자바다] p.776
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

    @Override
    public String toString() {
        return "{name:" + name + ", job:" + job + "}";
    }
}
