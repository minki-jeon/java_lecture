package ch05.sec11;

public class MainStringArrayArgument {
    //* Reference : [Book. 이것이 자바다] p.194
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("프로그램 입력값 부족");
            System.exit(0);                     // 프로그램 강제 종료
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
