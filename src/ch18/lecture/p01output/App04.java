package ch18.lecture.p01output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App04 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String fileName = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\output4.data";

        OutputStream os = new FileOutputStream(fileName);

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "번째 쓰는 중");
            os.write(1);
            Thread.sleep(2000);
        }
        System.out.println("출력 완료");

        // 사용 Stream(자원, resource)를 닫음 (Open한 영역에서 Close할 것)
        os.close();
    }
}
