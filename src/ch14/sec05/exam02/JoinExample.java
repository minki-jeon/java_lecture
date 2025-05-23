package ch14.sec05.exam02;

public class JoinExample {
    //* Reference : [Book. 이것이 자바다] p.608
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join();
        } catch (InterruptedException e) {
        }
        System.out.println("1~100 합: " + sumThread.getSum());
    }
}
