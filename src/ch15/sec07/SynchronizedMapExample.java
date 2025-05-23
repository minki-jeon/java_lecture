package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
    //* Reference : [Book. 이것이 자바다] p.684
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

        Thread threadA = new Thread() {
            @Override
            public void run() {
                // 객체 1000개 추가
                for (int i = 1; i <= 1000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                // 객체 1000개 추가
                for (int i = 1001; i <= 2000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
        }

        int size = map.size();
        System.out.println("총 객체 수: " + size);

        System.out.println();

    }
}
