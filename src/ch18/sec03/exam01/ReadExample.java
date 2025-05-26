package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    //* Reference : [Book. 이것이 자바다] p.789
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("D:\\01.private_work\\Choongang\\workspaces\\Temp\\test1.db");

            while (true) {
                int data = is.read();
                if (data == -1) break;
                System.out.println(data);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
