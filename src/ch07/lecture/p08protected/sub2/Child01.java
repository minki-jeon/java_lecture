package ch07.lecture.p08protected.sub2;

import ch07.lecture.p08protected.sub1.MyClass01;

public class Child01 extends MyClass01 {
    public void action2() {

        method1();      // public
        
        // protected : 다른 패키지에 있어도 상속 받은 클래스에서는 접근 가능
        method2();          // protected
//        method3();          // package private
//        method4();      // private
    }
}
