package ch18.lecture.p02input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class App02 {
    public static void main(String[] args) {
        String file = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\output1.data";
        try (InputStream is = new FileInputStream(file)) {
            int data = 0;
            while ((data = is.read()) != -1) {
                // -1이 return 되기 전까지 read
                System.out.println("data = " + data);
            }
            System.out.println("data = " + data);       // -1
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
