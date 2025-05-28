package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
    //* Reference : [Book. 이것이 자바다] p.199
    public static void main(String[] args) {
        // Week 열거 타입 변수 선언
        Week today = null;

        Calendar cal = Calendar.getInstance();

        // 오늘의 요일(1~7)
        int week = cal.get(Calendar.DAY_OF_WEEK);

        // 숫자를 열거 상수로 변환해서 변수에 대입
        today = switch (week) {
            case 1 -> Week.SUNDAY;
            case 2 -> Week.MONDAY;
            case 3 -> Week.TUESDAY;
            case 4 -> Week.WEDNESDAY;
            case 5 -> Week.THURSDAY;
            case 6 -> Week.FRIDAY;
            case 7 -> Week.SATURDAY;
            default -> today;
        };

        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("열심히 자바를 공부합니다.");
        }
    }
}
