package ch12.exercise.p05;

import java.util.Objects;

public class Student {
    //* Reference : [Book. 이것이 자바다] p.564
    private String studentNum;

    // Constructor 자동완성
    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    // Getter 자동완성
    public String getStudentNum() {
        return studentNum;
    }

    // equals() and hashCode() 자동완성
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentNum);
    }
}
