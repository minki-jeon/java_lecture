package ch03.exercise;

public class Exercise05 {
    //* Reference : [Book. 이것이 자바다] p.110
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;

        double area = (lengthTop + lengthBottom) * height / 2.0;
        System.out.println(area);

        area = (double) (lengthTop + lengthBottom) * height / 2;
        System.out.println(area);
    }
}
