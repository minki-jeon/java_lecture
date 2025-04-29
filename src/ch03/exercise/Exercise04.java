package ch03.exercise;

public class Exercise04 {
    //* Reference : [Book. 이것이 자바다] p.109
    public static void main(String[] args) {
        int value = 356;
        System.out.println("(value - (value % 100)) = " + (value - (value % 100)));
        System.out.println("(value - (value % 100)) = " + (value - (value % 300)));
        System.out.println("value / 100 * 100 = " + value / 100 * 100);
    }
}
