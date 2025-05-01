package ch04.sec07;

public class BreakOutterExample {
    //* Reference : [Book. 이것이 자바다] p.137
    public static void main(String[] args) {
        Outter:
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g') {

                    break Outter;
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}
