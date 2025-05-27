package ch18.lecture.p06file;

import java.io.File;

public class App01 {
    public static void main(String[] args) {
        // File : file 정보를 담고 있는 객체
        File f1 = new File("D:\\01.private_work\\Choongang\\workspaces\\Temp\\nothing.txt");
        File f2 = new File("D:\\01.private_work\\Choongang\\workspaces\\Temp\\bear.jpg");

        // 존재여부
        boolean r1 = f1.exists();
        System.out.println("r1 = " + r1);   // false
        boolean r2 = f2.exists();
        System.out.println("r2 = " + r2);   // true

        // 파일명
        String n1 = f2.getName();
        System.out.println("n1 = " + n1);

        // 파일경로
        String p1 = f2.getPath();
        System.out.println("p1 = " + p1);

        // 파일크기
        long l2 = f2.length();          // (byte기준)
        System.out.println("l2 = " + l2);

        // 디렉토리 여부
        boolean d2 = f2.isDirectory();
        System.out.println("d2 = " + d2);   // false

        // 파일 여부
        boolean v1 = f2.isFile();
        System.out.println("v1 = " + v1);   // true

    }
}
