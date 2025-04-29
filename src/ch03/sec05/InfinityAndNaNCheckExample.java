package ch03.sec05;

public class InfinityAndNaNCheckExample {
    //* Reference : [Book. 이것이 자바다] p.89
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;       // double z을 서로 번갈아가며 실행
        //double z = x % y;

        // 잘못된 코드
        System.out.println(z + 2);

        // 알맞은 코드
        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }
}
