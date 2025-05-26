package ch18.sec02.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    //* Reference : [Book. 이것이 자바다] p.784
    public static void main(String[] args) {
        try {
            try (OutputStream os = new FileOutputStream("D:\\01.private_work\\Choongang\\workspaces\\Temp\\test1.db")) {

                byte a = 10;
                byte b = 20;
                int c = 300000000;

                // 1byte씩 출력
                os.write(a);
                os.write(b);
                os.write(c);
                // write 3번 실행 = 3byte 파일 생성
                os.write(c);

                os.flush();     // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
//                os.close();     // 출력 스트림을 닫아 사용한 메모리를 해제
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
