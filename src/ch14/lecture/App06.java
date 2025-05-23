package ch14.lecture;

public class App06 {
    public static void main(String[] args) throws InterruptedException {
        // Thread 사용 시 주의해야할 점
        // 여러 쓰레드는 공유하는 객체의 상태를 변경할 때 조심해야한다.
        // - 다른 쓰레드가 작업 중에 객체 상태를 변경하는 경우 상태가 덮어씌어져 결과적으로 원치않는 결과가 나올 수 있다.

        Box06 box = new Box06();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        thread2.start();

        thread1.join();
        thread2.join();

        int value = box.getValue();
        System.out.println("value = " + value);     // 기대값: 200000, 실제 출력값: 200000이 아닌 값
    }
}

class Box06 {
    private int value;

    public int getValue() {
        return value;
    }

    public void increase() {
        value++;
    }
}