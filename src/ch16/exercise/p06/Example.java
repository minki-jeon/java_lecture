package ch16.exercise.p06;

public class Example {
    //* Reference : [Book. 이것이 자바다] p.719
    public static double calc(Function fun) {
        double x = 10;
        double y = 4;
        return fun.apply(x, y);
    }

    public static void main(String[] args) {
        double result = calc((x, y) -> (x / y));
        System.out.println("result = " + result);
    }


}
