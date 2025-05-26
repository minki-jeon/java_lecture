package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    //* Reference : [Book. 이것이 자바다] p.795
    public static void main(String[] args) throws IOException {
        try (Writer writer = new FileWriter("D:\\01.private_work\\Choongang\\workspaces\\Temp\\test.txt")) {

            // 1 문자씩 출력
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            // char 배열 출력
            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            // 문자열 출력
            writer.write("FGH");

            writer.flush();

//            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
