package ch04.sec02;

public class IfNestedExample {
    //* Reference : [Book. 이것이 자바다] p.119
    public static void main(String[] args) {
        int score = (int) (Math.random() * 20) + 81;
        // Math.random()            = 0.0 <= N < 1.0
        // Math.random() * 20       = 0.0 <= N < 20.0
        // Math.random() * 20 + 81  = 81.0 <= N < 101
        // 81 ~ 100 난수
        System.out.println("점수: " + score);

        String grade;
        if (score >= 90) {
            if (score >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if (score >= 85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }
        System.out.println("학점: " + grade);
    }
}
