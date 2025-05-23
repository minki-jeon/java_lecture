package ch11.lecture;

public class App08 {
    public static void main(String[] args) {

        try {
            int[] arr = {5, 0};
            int c = arr[0] / arr[1];
            System.out.println("c = " + c);
            System.out.println("다음 코드들");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눔");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out");
        } finally {
            // finally : Exception 발생 여부와 관계없이, 심지어 메소드 종료(return)이 되더라도 항상 실행되는 영역
            System.out.println("항상 실행되는 코드 블록");
        }
        System.out.println("이어지는 코드...");
    }
}
