package ch04.lecture;

public class C05Random {
    public static void main(String[] args) {
        // 0.0 <= Math.random() < 1.0
        // return type: Double
        System.out.println(Math.random());

        double a = Math.random();
        // 0.0 <= a < 1.0

        // 주사위
        int dice = (int) (Math.random() * 6) + 1;
        // 0 < dice < 6
        System.out.println("dice = " + dice);

        int score = (int) (Math.random() * 20) + 81;
        System.out.println("score = " + score);

        // (정수기준) (Math.random() * {최대값-최소값+1}) + {최소값}
    }
}
