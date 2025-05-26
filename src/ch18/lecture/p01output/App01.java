package ch18.lecture.p01output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
    public static void main(String[] args) throws IOException {
        // Output Steam : (출력)프로그램에서 나가는 데이터 스트림
        // write() : byte 단위로 출력
        String fileName = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\output1.data";
        OutputStream os = new FileOutputStream(fileName);

        // int 값을 파라미터값으로 받더라도 8bits 크기만 사용한다.
        os.write(100);      // 100
        os.write(200);      // 200 -> (1byte기준) -56
        os.write(300);      // 300 -> (1byte기준) 44

        System.out.println("프로그램 종료");

    }
}
