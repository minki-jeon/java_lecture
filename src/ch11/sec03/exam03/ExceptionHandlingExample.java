package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    //* Reference : [Book. 이것이 자바다] p.474
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for (int i = 0; i <= array.length; i++) {       // i = 0, 1, 2, 3, 4
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("데이터에 문제가 있음: " + e.getMessage());
            }
        }
    }
}
