package ch02.lecture;

public class C08Boolean {
    public static void main(String[] args) {
        // boolean(논리형, Boolean, 부울형)
        // 1byte, 8bits

        // 가능한 값: true, false

        boolean a;
        a = true;
        System.out.println("a = " + a);
        a = false;
        System.out.println("a = " + a);

        if (a) {
            System.out.println("true이면 실행1");
        }

        a = true;

        if (a) {
            System.out.println("true이면 실행2");
        }
        

    }
}
