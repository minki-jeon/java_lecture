package ch02.sec01;

public class VariableExchangeExample {
    //* Reference : [Book. 이것이 자바다] p.40
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x + ", y:" + y);
    }
}
