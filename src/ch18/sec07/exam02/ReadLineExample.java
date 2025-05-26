package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExample {
    //* Reference : [Book. 이것이 자바다] p.805
    public static void main(String[] args) throws IOException {
        // FileReader에 BufferdREader 보조스트림 연결
        BufferedReader br = new BufferedReader(new FileReader("src/ch18/sec07/exam02/ReadLineExample.java"));

        int lineNo = 1;
        while (true) {
            String str = br.readLine();             // 1행 읽음
            if (str == null) break;
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }
        br.close();
    }
}
