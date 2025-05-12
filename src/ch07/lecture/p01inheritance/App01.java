package ch07.lecture.p01inheritance;

public class App01 {
    public static void main(String[] args) {
        SubMyClass011 a = new SubMyClass011();
        a.age = 33;
        a.name = "trump";
        System.out.println("a.age = " + a.age);
        System.out.println("a.name = " + a.name);
        a.action();
        a.greeting();

        SubMyClass012 b = new SubMyClass012();
        b.age = 44;
//        b.name = "abc";
        b.address = "ny";
        System.out.println("b.age = " + b.age);
        System.out.println("b.address = " + b.address);
        b.action();
//        b.greeting();
        b.go();

        MyClass01 c = new MyClass01();
        c.age = 77;
//        c.name = "q";
//        c.address = "n";
        System.out.println("a.age = " + a.age);
        c.action();
//        c.greeting();
//        c.go();
    }

}

class MyClass01 {
    // 상위(부모) 클래스, Super(parent) Class
    // 상속받는 하위(자식)클래스는 여러번 작성 가능
    public int age;

    public void action() {

    }
}

//class MyClass02 {
//}

class SubMyClass011 extends MyClass01 /*, MyClass02 */ {
    // 하위(자식) 클래스, Sub(Child) Class
    // 상속받을 수 있는 상위(부모) 클래스는 하나만 가능

    // field
    public String name;

    // method
    public void greeting() {

    }
}

class SubMyClass012 extends MyClass01 {
    public String address;

    public void go() {

    }
}
