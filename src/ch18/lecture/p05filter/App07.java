package ch18.lecture.p05filter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class App07 {
    public static void main(String[] args) throws IOException {
        String file = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\filter07.txt";
        try (OutputStream os = new FileOutputStream(file)) {
            os.write('a');
            os.write('b');
        }

        // OutputStreamWriter: Output Stream을 Writer로 변환
        // PrintStream: Output Stream을 사용하여 출력하는 메소드

        OutputStream os = new FileOutputStream(file);
        PrintStream ps = new PrintStream(os);

        try (os; ps) {
            ps.println("ab");
            ps.println("xy");
            ps.println("한글");
            ps.println("🧢✊✌️✋");
        }

    }
}
