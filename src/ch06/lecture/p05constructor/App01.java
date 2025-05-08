package ch06.lecture.p05constructor;

public class App01 {
    MyClass01 a = new MyClass01();
    MyClass01 b = new MyClass01();

}

class MyClass01 {
    // field
    // method
    // constructor

    // 생성자 :
    //  {클래스명}() {  }
    MyClass01() {
        // 인스턴스 생성할 때 해야할 동작을 구현
        System.out.println("새 인스턴스 생성");
    }
}
