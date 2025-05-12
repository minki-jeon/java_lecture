package ch07.sec09;

public class InstanceofExample {
    //* Reference : [Book. 이것이 자바다] p.323
    public static void personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        // person이 참조하는 객체가 student 타입인지 확인
        if (person instanceof Student) {
            // 강제 타입 변환
            Student student = (Student) person;
            // Student 객체만 가지고 있는 필드, 메소드
            System.out.println("StudentNo: " + student.studentNo);
            student.study();
        }

        // person이 참조하는 객체가 student 타입일 경우 student 변수에 대입 (강제 타입 변환)
        if (person instanceof Student student) {
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        // Person 객체를 매개값으로 제공, personInfo() 메소드 호출
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        // Student 객체를 매개값으로 제공, personInfo() 메소드 호출
        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
