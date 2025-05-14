package ch16.exercise.p07;

public class Example {
    //* Reference : [Book. 이것이 자바다] p.719

    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        //최대값 얻기
        int max = maxOrMin((result, score) -> result > score ? result : score);
        System.out.println("최대값: " + max);

        //최소값 얻기
        int min = maxOrMin((result, score) -> result < score ? result : score);
        System.out.println("최소값: " + min);
    }
}
