package ch04.sec08;

public class ContinueExample {
    //* Reference : [Book. 이것이 자바다] p.139
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
