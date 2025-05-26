package ch18.sec02.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    //* Reference : [Book. 이것이 자바다] p.786
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("D:\\01.private_work\\Choongang\\workspaces\\Temp\\test2.db");
            byte[] array = {10, 20, 30};        // 3byte

            os.write(array);

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
