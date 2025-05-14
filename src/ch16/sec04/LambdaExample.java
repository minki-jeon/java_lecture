package ch16.sec04;

public class LambdaExample {
    //* Reference : [Book. 이것이 자바다] p.707
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문 2개 이상
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // 리턴문 1개 (연산식)
//        person.action((x, y) -> {
//            return (x + y);
//        });
        person.action((x, y) -> (x + y));

        // 리턴문 1개 (메소드 호출)
//        person.action((x, y) -> {
//            return sum(x, y);
//        });
        person.action((x, y) -> sum(x, y));


    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}
