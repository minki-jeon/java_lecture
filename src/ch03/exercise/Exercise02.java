package ch03.exercise;

public class Exercise02 {
    //* Reference : [Book. 이것이 자바다] p.109
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score > 90)) ? "가" : "나";
        System.out.println(result);
    }
}
