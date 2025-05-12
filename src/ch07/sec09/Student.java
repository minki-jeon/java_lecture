package ch07.sec09;

public class Student extends Person {
    //* Reference : [Book. 이것이 자바다] p.325
    public int studentNo;

    public Student(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    public void study() {
        System.out.println("공부를 합니다.");
    }
}
