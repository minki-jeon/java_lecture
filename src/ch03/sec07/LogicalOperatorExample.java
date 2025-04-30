package ch03.sec07;

public class LogicalOperatorExample {
    //* Reference : [Book. 이것이 자바다] p.94
    public static void main(String[] args) {
        int charCode = 'A';         // = 65
//        int charCode = 'a';
//        int charCode = '5';

        if ((65 <= charCode) & (charCode <= 90)) {      // 'A' <= charCode <= 'Z'
            System.out.println("대문자이군요.");
        }
        if ((97 <= charCode) && (charCode <= 122)) {    // 'a' <= charCode <= 'z'
            System.out.println("소문자이군요.");
        }
        if ((48 <= charCode) && (charCode <= 57)) {     // '0' <= charCode <= '9'
            System.out.println("0~9 숫자이군요.");
        }

        // ------------------------------------------------------

        int value = 6;
//        int value = 7;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수이군요.");
        }

        boolean result = (value % 2 == 0) || (value % 3 == 0);
        if (!result) {
            System.out.println("2 또는 3의 배수가 아니군요.");
        }
    }
}
