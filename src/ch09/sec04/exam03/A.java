package ch09.sec04.exam03;

public class A {
    //* Reference : [Book. 이것이 자바다] p.407

    public void method1(int arg) {  // = final int arg
        // local variable
        int var = 1;        // final int var = 1;

        // local class
        class B {
            void method2() {
                // call local variable
                System.out.println("arg = " + arg);
                System.out.println("var = " + var);

                // local variable 수정불가
//                arg = 2;
//                var = 2;
            }
        }

        B b = new B();
        // local 객체 메소드 호출
        b.method2();

        // local variable 수정 불가
//        arg = 3;
//        var = 3;
    }
}
