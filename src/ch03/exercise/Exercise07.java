package ch03.exercise;

public class Exercise07 {
    //* Reference : [Book. 이것이 자바다] p.110
    public static void main(String[] args) {
        double x = 5.0;
        double y = 0.0;
//        double z = 5 % y;
        double z = x % y;
        if (Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z + 10;
            System.out.println("결과: " + result);
        }
    }
}
