package ch18.lecture.p05filter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App03 {
    public static void main(String[] args) throws IOException {
        // 속도차이 확인
        // Buffered를 사용하면 속도가 더 빠르다.

        buffered();

        notBuffered();

    }

    private static void notBuffered() throws IOException {
        long start = System.nanoTime();

        String file = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\filter03.txt";

        Writer writer = new FileWriter(file);
//        BufferedWriter br = new BufferedWriter(writer);

        try (writer) {
            for (int i = 0; i < 1_000_000; i++) {
                writer.write("this is java");
                writer.write("\n");
            }
            writer.flush();
        }
        long end = System.nanoTime();
        System.out.println("(end - start) = " + (end - start));
    }


    private static void buffered() throws IOException {
        long start = System.nanoTime();

        String file = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\filter03.txt";

        Writer writer = new FileWriter(file);
        BufferedWriter br = new BufferedWriter(writer);

        try (br; writer) {
            for (int i = 0; i < 1_000_000; i++) {
                br.write("this is java");
                br.newLine();
            }
            br.flush();
        }
        long end = System.nanoTime();
        System.out.println("(end - start) = " + (end - start));
    }
}
