package ch14.exercise.p02;

public class MusicRunnable extends Thread {
    //* Reference : [Book. 이것이 자바다] p.636

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
    }
}
