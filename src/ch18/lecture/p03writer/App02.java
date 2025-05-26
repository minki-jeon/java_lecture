package ch18.lecture.p03writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App02 {
    public static void main(String[] args) throws IOException {
        // * reader + writer의 필요성
        // byte단위 inputStream. outputStream으로
        // 문자(ascii 코드 외)를 읽고 쓰는게 불편
        // -> 문자(Character) 단위 reader, writer 추가

        // writer: 문자 단위 출력 스트림

        String fileName = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\writer02.txt";
        try (Writer writer = new FileWriter(fileName)) {
            writer.write('a');      // a    (1byte)
            writer.write(97);       // a    (1byte)
            writer.write('걸');      // 걸    (3byte)
            writer.write(44152);    // 걸    (3byte)
            writer.flush();
        }

        System.out.println("파일 쓰기 완료");

    }


}
