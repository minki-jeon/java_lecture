package ch03.lecture;

public class C07Double {
    public static void main(String[] args) {
        // 0.1과 0.2와 같은 실수(double)는 이진법으로 정확하게 표현할 수 없기 때문에, 근사값으로 저장됨
        double a = 0.1;
        double b = 0.2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        double c = a + b;
        System.out.println("c = " + c);
    }
}
