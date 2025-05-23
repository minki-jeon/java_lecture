package ch14.lecture;

public class App09 {
    public static void main(String[] args) throws InterruptedException {
        // Thread 사용 시 주의해야할 점
        // 여러 쓰레드는 공유하는 객체의 상태를 변경할 때 조심해야한다.

        Box09 box = new Box09();

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

class Box09 {
    private int value;

    public int getValue() {
        return value;
    }

    // synchronized method
    //  : (monitor) lock (:this)을 획득한 스레드만 실행 가능
    public synchronized void increase() {
        value++;
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
}
