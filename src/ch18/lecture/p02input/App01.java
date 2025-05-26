package ch18.lecture.p02input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;

public class App01 {
    public static void main(String[] args) {
        // input stream (입력 스트림) : 프로그램으로 데이터를 읽는 스트림

        String filename = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\output1.data";
        try (InputStream is = new FileInputStream(filename)) {

            // read: 1byte를 읽어서 int return (나머지 3byte는 0으로
            int read1 = is.read();
            int read2 = is.read();
            int read3 = is.read();
            int read4 = is.read();      // 더이상 읽을 것이 없으면 -1 return

            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
            System.out.println("read3 = " + read3);
            System.out.println("read4 = " + read4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
