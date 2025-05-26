package ch18.exercise.p10;

import java.io.*;

public class Example {
    //* Reference : [Book. 이것이 자바다] p.824
    public static void main(String[] args) throws IOException {
        String origin = "images/eagle.jpg";
        String target = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\eagle.jpg";

        // 파일 복사
        // BufferedInputStream, BufferedOutputStream

        System.out.println("원본 파일 경로: " + origin);
        System.out.println("복사 파일 경로: " + target);

        long start = System.nanoTime();
        try {
            InputStream is = new FileInputStream(origin);
            BufferedInputStream bis = new BufferedInputStream(is);

            OutputStream os = new FileOutputStream(target);
            BufferedOutputStream bos = new BufferedOutputStream(os);

            try (is; bis; os; bos) {
                byte[] data = new byte[1024];
                int length = 0;
                while ((length = is.read(data)) != -1) {
                    bos.write(data, 0, length);
                }
                bos.flush();
            }

            System.out.println("복사가 성공되었습니다.");

        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("원본 파일이 존재하지 않습니다.");
        }

        long end = System.nanoTime();
        System.out.println("(end-start) = " + (end - start));


    }
}
