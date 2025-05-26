package ch18.lecture.p05filter;

import java.io.*;

public class App05 {
    public static void main(String[] args) throws IOException {
        String file = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\filter05.txt";
        // OutputStream을 Writer로 감싸는 보조스트림(filter stream)
        // : OutputStreamWriter
        try (OutputStream os = getOutputStream(file);
             Writer osw = new OutputStreamWriter(os)) {
            os.write('a');
            os.write('b');
            os.write('x');
            os.write('y');
            osw.write('한');     // Writer 보조스트림에 의해 한글 입력 가능
            os.flush();
        }
    }

    private static OutputStream getOutputStream(String file) throws IOException {
        return new FileOutputStream(file);
    }
}
