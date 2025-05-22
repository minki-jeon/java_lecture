package ch11.lecture;

public class App06 {
    public static void main(String[] args) {
        try {
            int[] arr = {5, 0};

            int c = arr[0] / arr[1];
            System.out.println("프로그램 진행됨");
/*
        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("예외 처리 코드 1");
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("예외 처리 코드 2");
        }
*/
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("예외 처리 코드");
        }
        
        System.out.println("나머지 코드들");
    }
}
