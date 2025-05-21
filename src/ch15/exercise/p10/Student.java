package ch15.exercise.p10;

public class Student implements Comparable<Student> {
    //* Reference : [Book. 이것이 자바다] p.693
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
    }
}
