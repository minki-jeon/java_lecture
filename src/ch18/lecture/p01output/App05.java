package ch18.lecture.p01output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App05 {
    public static void main(String[] args) {

        String file = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\output5.data";

        // 예전 코드 스타일
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);

            os.write(3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {   // 필수
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // try-with-resources 사용
        // try의 ()안에 닫을 stream을 선언하면 java(JVM)이 자동으로 close
        try (OutputStream os2 = new FileOutputStream(file)) {
            os2.write(3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try-with-resources 사용
        // try의 ()안에 닫을 stream을 선언하면 java(JVM)이 자동으로 close
        try {
            OutputStream os3 = new FileOutputStream(file);
            try (os3) {
                os3.write(3);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
