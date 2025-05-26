package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    //* Reference : [Book. 이것이 자바다] p.792
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("D:\\01.private_work\\Choongang\\workspaces\\Temp\\test2.db");

            byte[] data = new byte[100];
            while (true) {
                int num = is.read(data);        // 최대 100byte를 읽고 읽은 Byte는 data 저장, 읽은 수는 리턴
                if (num == -1) break;

                for (int i = 0; i < num; i++) {     // 읽은 Byte 수 만큼 반복
                    System.out.println(data[i]);        // 읽은 바이트 출력
                }
            }
            is.close();                 // 배열의 모든 바이트를 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
