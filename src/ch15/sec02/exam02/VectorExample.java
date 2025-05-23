package ch15.sec02.exam02;

import ch15.sec02.exam01.Board;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    //* Reference : [Book. 이것이 자바다] p.647
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        Thread threadA = new Thread() {
            @Override
            public void run() {
                // 객체 1000개 추가
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                // 객체 1000개 추가
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
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
        int size = list.size();
        System.out.println("총 엔트리 수: " + size);
        System.out.println();

    }
}
