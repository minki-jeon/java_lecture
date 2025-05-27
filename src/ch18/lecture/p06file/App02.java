package ch18.lecture.p06file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class App02 {
    public static void main(String[] args) throws IOException {
        // 존재하지 않는 디렉토리 생성
//        String d1 = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\some";
//        File f1 = new File(d1);
//        System.out.println(f1.exists());    // false
//        if (!f1.exists()) {
//            f1.mkdir();     // 하나의 디렉토리 생성
//        }
        String d2 = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\some\\sub";
        File f2 = new File(d2);
        System.out.println(f2.exists());
        if (!f2.exists()) {
            f2.mkdirs();        // 상위 디렉토리까지 포함하여 생성
        }
        String file = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\some\\sub\\file2.txt";
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);
        try (ps; fos) {
            ps.println("hello file");
            ps.flush();
        }
    }
}
