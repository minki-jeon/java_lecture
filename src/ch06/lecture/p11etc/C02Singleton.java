package ch06.lecture.p11etc;

public class C02Singleton {
    public static void main(String[] args) {
        // singleton(싱글톤): 프로그램을 작성하는 패턴 중 하나
        //    특정 타입(클래스)의 객체가 프로그램 내에 하나가 되도록 보장하는 코드 패턴
        //    - 객체(클래스) 하나만 참조하여 사용한다.

        MyClass01 a = new MyClass01();
        MyClass01 b = new MyClass01();

//        MyClass02 c = new MyClass02();
//        MyClass02 d = new MyClass02();

        MyClass02 e = MyClass02.getInstance();
        MyClass02 f = MyClass02.getInstance();
        // 동일한 객체(클래스) 참조하는 변수
        System.out.println(e == f);
    }
}


class MyClass02 {

    private static MyClass02 object;

    private MyClass02() {
        // 싱글톤 패턴을 위해 생성자 private으로 작성
    }

    public static MyClass02 getInstance() {
        // 생성자를 반환하는 메소드를 public으로 작성
        if (object == null) {
            MyClass02 obj = new MyClass02();
            object = obj;
        }

        return object;
    }
}

class MyClass01 {

}