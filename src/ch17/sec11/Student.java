package ch17.sec11;

public class Student {
    //* Reference : [Book. 이것이 자바다] p.760
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
