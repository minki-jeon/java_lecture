package ch18.exercise.p10;

import java.io.*;
import java.util.Scanner;

public class Example2 {
    //* Reference : [Book. 이것이 자바다] p.824
    public static void main(String[] args) throws IOException {
        // (1)
        /*
        String originFileName = "D:/01.private_work/Choongang/workspaces/Temp/dir1/lion.jpg";
        String targetFileName = "D:/01.private_work/Choongang/workspaces/Temp/dir2/lion2.jpg";
        */
        // (2), (3)
        String originFileName = null;
        String targetFileName = null;
        // (2)
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("원본 파일 경로: ");
        originFileName = scanner.nextLine();
        System.out.print("복사 파일 경로: ");
        targetFileName = scanner.nextLine();
        */
        // (3)
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("원본 파일 경로: ");
        originFileName = br.readLine();
        System.out.print("복사 파일 경로: ");
        targetFileName = br.readLine();

        // (2)
//        try (scanner) {
        // (3)
        try (br; isr) {
            File originFile = new File(originFileName);
            if (originFile.exists()) {
//            int lastSlashIndex = targetFileName.lastIndexOf("\\");
                int lastSlashIndex = targetFileName.lastIndexOf("/");
                File directory = new File(targetFileName.substring(0, lastSlashIndex));
                if (!directory.exists()) {
                    directory.mkdirs();
                }

                InputStream is = new FileInputStream(originFile);
                OutputStream os = new FileOutputStream(targetFileName);

                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                try (bos; bis; os; is) {
                    byte[] data = new byte[1024];
                    int len = 0;

                    while ((len = bis.read(data)) != -1) {
                        bos.write(data, 0, len);
                    }
                    bos.flush();
                }
            } else {
                System.out.println("원본 파일이 존재하지 않습니다.");
            }
        }

    }
}
