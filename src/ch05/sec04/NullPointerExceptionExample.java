package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        //* Reference : [Book. 이것이 자바다] p.153
        int[] intArray = null;
//        intArray[0] = 10;       // NullPointerException

        String str = null;
//        System.out.println("총 문자 수: " + str.length());  // NullPointerException
    }
}
