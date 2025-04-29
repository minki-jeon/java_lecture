package ch03.sec04;

public class AccuracyExample1 {
    //* Reference : [Book. 이것이 자바다] p.87
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;     // 근사값으로 저장된다.
        int number = 7;

        double result = apple - number * pieceUnit;     // 1 - (7 * 0.1) = 0.3 (근사값)
        System.out.println("사과 1개에서 남은 양: " + result);
    }
}
