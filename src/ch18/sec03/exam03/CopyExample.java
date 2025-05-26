package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    //* Reference : [Book. 이것이 자바다] p.793
    public static void main(String[] args) throws IOException {
        String originalFileName = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\test.jpg";
        String targetFileName = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\test2.jpg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);
        try (is; os;) {

            byte[] data = new byte[1024];
            while (true) {
                int num = is.read(data);
                if (num == -1) break;
                os.write(data, 0, num);
            }
            os.flush();
//            os.close();
//            is.close();
        }

        System.out.println("복사가 잘 되었습니다.");
    }
}
