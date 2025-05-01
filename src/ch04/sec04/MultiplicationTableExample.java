package ch04.sec04;

public class MultiplicationTableExample {
    //* Reference : [Book. 이것이 자바다] p.129
    public static void main(String[] args) {
        for (int m = 2; m <= 9; m++) {
            System.out.println("*** " + m + "단 ***");
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + " × " + n + " = " + (m * n));
            }
        }
    }
}
