package ch11.exercise.p06;

public class Example {
    //* Reference : [Book. 이것이 자바다] p.486
    public static void main(String[] args) {
        String[] strArray = {"10", "2a"};
        int value = 0;
        for (int i = 0; i <= 2; i++) {
            try {
                value = Integer.parseInt(strArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스 초과");
            } catch (NumberFormatException e) {
                System.out.println("숫자 변환 불가");
            } finally {
                System.out.println(value);
            }
        }
    }
}
