package ch18.sec02.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    //* Reference : [Book. 이것이 자바다] p.787
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("D:\\01.private_work\\Choongang\\workspaces\\Temp\\test3.db");

            byte[] array = {10, 20, 30, 40, 50};

            os.write(array, 1, 3);      // 1번 인덱스부터 3개까지만 출력 (=3bytes)

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
