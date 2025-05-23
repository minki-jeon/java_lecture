package ch14.lecture;

import java.util.*;

public class App12 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> l = new ArrayList<>();
//        List<Integer> list = new Vector<>();
        // Collections.synchronizedList: 기존 컬렉션 타입(LIst / Map / Set)을 동기화된 컬렉션으로 변환
        List<Integer> list = Collections.synchronizedList(l); // Synchronized-ArrayList
//        Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());
//        Set<Integer> set = Collections.synchronizedSet(new HashSet<>());


        Random random = new Random();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(random.nextInt());
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(random.nextInt());
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(list.size());
    }
}
