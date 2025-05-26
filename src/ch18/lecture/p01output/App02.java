package ch18.lecture.p01output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App02 {
    // Output Steam : byte 단위 출력 스트림
    // write 메소드
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("D:\\01.private_work\\Choongang\\workspaces\\Temp\\output2.data");

        os.write(3000);     // 1byte
        os.write(new byte[]{7, 5, 4, 3, 2, 1});     // 7byte

        System.out.println("프로그램 종료");
    }

}
