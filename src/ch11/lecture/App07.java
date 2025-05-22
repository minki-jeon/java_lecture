package ch11.lecture;

public class App07 {
    public static void main(String[] args) {
        try {
            int[] arr = {5, 0};

//            int c = arr[0] / arr[1];
            int c = arr[2] / arr[1];
            System.out.println("c = " + c);
//        } catch (ArithmeticException | IndexOutOfBoundsException e) {
//        } catch (RuntimeException e) {  // 상위 예외 클래스
//        } catch (Exception e) {  // 상위 예외 클래스
        } catch (Throwable e) {  // 상위 예외 클래스
//            e.printStackTrace();
            System.out.println("예외 처리 코드");
        }
    }
}
