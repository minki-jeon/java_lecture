package ch18.sec04.exam02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    //* Reference : [Book. 이것이 자바다] p.797
    public static void main(String[] args) throws IOException {
        try {
            Reader reader = null;
            // 1문자 씩 읽기
            reader = new FileReader("D:\\01.private_work\\Choongang\\workspaces\\Temp\\test.txt");
            while (true) {
                int data = reader.read();
                if (data == -1) break;
                System.out.println((char) data);
            }
            reader.close();
            System.out.println();

            // 문자 배열로 읽기
            reader = new FileReader("D:\\01.private_work\\Choongang\\workspaces\\Temp\\test.txt");
            char[] data = new char[100];
            while (true) {
                int num = reader.read(data);
                if (num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
