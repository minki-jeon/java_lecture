package ch07.sec07.exam02;

public class ChildExample {
    //* Reference : [Book. 이것이 자바다] p.311
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();
//        parent.method3();

        // 강제형변환(type casting) (위험)
        Child c = (Child) parent;
        c.method3();
    }
}
