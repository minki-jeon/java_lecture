package ch18.lecture.p04reader;

import java.io.*;

public class App02 {
    public static void main(String[] args) throws IOException {

        String fileName = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\reader02.txt";
        try (Writer writer = new FileWriter(fileName)) {
            writer.write('a');
            writer.write('한');
            writer.write('글');      // Char
            writer.write("날");      // String (2byte)
            writer.write("🧢"); // String    (3byte) => 2번 읽어들임
            writer.flush();
        }

        try (Reader reader = new FileReader(fileName)) {
            char[] data = new char[10];
            int length = reader.read(data);

            System.out.println("length = " + length);   // 6
        }


    }
}
