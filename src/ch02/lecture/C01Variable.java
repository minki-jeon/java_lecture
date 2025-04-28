package ch02.lecture;

public class C01Variable {
    public static void main(String[] args) {

        // 변수 : 값을 담는 이름있는 공간

        // 변수 선언 : {타입} {변수명};
        int a;
        double b;
        String c;

        // 변수에 값 할당(대입, assgin, assignment)
        // {변수명} = {값};
        a = 9;
        b = 3.14;
        c = "hello";

        // 변수 선언과 값 동시 할당
        int d = 7;
        double e = 9.12;
        String f = "java";

        // 여러 변수를 동시 선언
        int g, h;
        double i, j, k;
        String l, m, n, o;
        g = 8;
        h = 7;
        i = 9.88;
        n = "hi";

        // 여러 변수 선언과 값 할당을 한 라인에 작성
        int p = 3, q = 4;
        double r = 3.14, s = 9.12;

        // 변수에 값을 넣지 않고 사용할 수 없다.
        int t = 3;
        int u;
        int v;
        u = 4;
        System.out.println(t);
        System.out.println(u);
//        System.out.println(v);    // Error

    }



}
