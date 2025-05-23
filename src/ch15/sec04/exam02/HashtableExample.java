package ch15.sec04.exam02;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashtableExample {
    //* Reference : [Book. 이것이 자바다] p.662
    public static void main(String[] args) {
        // HashTable (Old Version)
        // = ConcurrentHashMap : HashMap과 동일한 구조 / 동기화된(Synchronized) 메소드 / 하나의 쓰레드만 사용 가능
        Map<String, Integer> map = new ConcurrentHashMap<>();
//        Map<String, Integer> map = new HashMap<>();

        Thread threadA = new Thread() {
            @Override
            public void run() {
                // 엔트리 1000개 추가
                for (int i = 1; i <= 1000; i++) {
                    map.put(String.valueOf(i), i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                // 엔트리 1000개 추가
                for (int i = 1001; i <= 2000; i++) {
                    map.put(String.valueOf(i), i);
                }
            }
        };

        threadA.start();
        threadB.start();

        // 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
        }

        // 저장된 총 엔트리 수 얻기
        int size = map.size();
        System.out.println("총 엔트리 수: " + size);
        System.out.println();
    }
}
