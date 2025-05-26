package ch18.lecture.p02input;

import java.io.*;
import java.util.Arrays;

public class App04 {
    public static void main(String[] args) throws IOException {

        // inputstream에서 사용할 파일 생성
        String fileName = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\input03.data";
        try (OutputStream os = new FileOutputStream(fileName)) {
            for (int i = 0; i < 35; i++) {
                // 35 bytes
                os.write(i);
            }
        }
        System.out.println("파일 생성 종료");

        byte[] data = new byte[10];

        try (InputStream is = new FileInputStream(fileName)) {
            int length = 0;
            while ((length = is.read(data)) != -1) {
                byte[] copy = Arrays.copyOf(data, length);
                // data -> copy 배열 복사
                System.out.println("data = " + Arrays.toString(copy));

            }

        }
    }
}
