package ch14.exercise.p02;

public class ThreadExample {
    //* Reference : [Book. 이것이 자바다] p.635
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.start();
    }
}
