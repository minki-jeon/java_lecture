package ch16.lecture.p01lambda;

public class App04 {
    public static void main(String[] args) {
        MyInterface04 a = (int x, String b) -> {
            System.out.println(b + ", " + x);
        };

        MyInterface04 c = (x, y) -> {
            System.out.println(y + ", " + x);
        };

        MyInterface04 d = (x, y) -> System.out.println(y + ", " + x);

//        MyInterface04 a = new MyInterface04() {
//            @Override
//            public void action(int a, String b) {
//                System.out.println(b + ", " + a);
//            }
//        };
    }
}

@FunctionalInterface
interface MyInterface04 {
    void action(int a, String b);
}
