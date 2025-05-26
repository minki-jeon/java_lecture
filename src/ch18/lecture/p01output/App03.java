package ch18.lecture.p01output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App03 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("D:\\01.private_work\\Choongang\\workspaces\\Temp\\output3.data");

        os.write(300);  // 1byte
        os.write(new byte[]{1, 2, 3, 4, 5});    // 5 bytes
        os.write(new byte[]{2, 3, 4, 5, 6, 7}, 2, 3);   // 배열의 index 2부터 3개를 출력 = 3bytes

        System.out.println("프로그램 종료");
    }
}
