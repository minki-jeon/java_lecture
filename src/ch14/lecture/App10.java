package ch14.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class App10 {
    public static void main(String[] args) throws InterruptedException {
        // Thread 사용 시 주의해야할 점
        // 여러 쓰레드는 공유하는 객체의 상태를 변경할 때 조심해야한다.

        Box10 box = new Box10();

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

class Box10 {
    // AtomicInteger : 원자성을 갖는 변수타입 (CAS;Compare-And-Swap 연산동작)
    //	          - 연산작업 전의 값을 기억하고 있다가, 연산이 끝날 때 값이 변하지 않으면 결과를 적용하고
    //	 	        값이 변경되었으면 연산을 다시 시도한다.
    private AtomicInteger value;

    public Box10() {
        value = new AtomicInteger(0);   // 초기값 0
    }

    public int getValue() {
        return value.intValue();                // 현재 값을 int로 반환
    }

    public void increase() {
        value.incrementAndGet();               // 값을 1 증가시키고, 증가된 값 반환
    }
}
