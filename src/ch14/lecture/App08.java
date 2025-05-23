package ch14.lecture;

public class App08 {
    public static void main(String[] args) throws InterruptedException {
        // Thread 사용 시 주의해야할 점
        // 여러 쓰레드는 공유하는 객체의 상태를 변경할 때 조심해야한다.

        Box08 box = new Box08();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        t2.start();

        t1.join();
        t2.join();

        int value = box.getValue();
        System.out.println("value = " + value);
    }
}

class Box08 {
    private int value;

    public int getValue() {
        return value;
    }

    public void increase() {
        // synchronized block
        // : (monitor) lock을 획득한 스레드만 실행 가능
        synchronized (this /*자신 객체의 참조*/) {
            // 이 영역은 하나의 쓰레드만 동작 (lock)
            value++;
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
        }
    }
}
