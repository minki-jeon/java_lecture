package ch18.sec09;

import java.io.*;

public class PrintStreamExample {
    //* Reference : [Book. 이것이 자바다] p.809
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\01.private_work\\Choongang\\workspaces\\Temp\\printstream.txt");
        PrintStream ps = new PrintStream(fos);

        try (ps; fos) {
            ps.print("마치");
            ps.println("프린터가 출력하는 것처럼");
            ps.println("데이터를 출력합니다.");
            ps.printf("| %6d | %-10s | %10s | \n", 1, "홍길동", "도적");
            ps.printf("| %6d | %-10s | %10s | \n", 2, "감자바", "학생");

            ps.flush();
//        ps.close();
        }
    }
}
