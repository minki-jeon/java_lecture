package ch04.exercise;

public class Exercise02 {
    //* Reference : [Book. 이것이 자바다] p.140
    public static void main(String[] args) {
        String grade = "B";

//        int score1 = 0;
//        switch (grade) {
//            case "A":
//                score1 = 100;
//                break;
//            case "B":
//                int result = 100 - 20;
//                score1 = result;
//                break;
//            default:
//                score1 = 60;
//        }
        int score1 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };

    }
}
