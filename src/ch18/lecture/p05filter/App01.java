package ch18.lecture.p05filter;

import java.io.*;

public class App01 {
    public static void main(String[] args) throws IOException {

        String fileName = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\filter01.txt";
        try (Writer writer = new FileWriter(fileName)) {
            writer.write('a');
            writer.write('한');
            writer.write('글');      // Char
            writer.write("날");      // String
            writer.write("🧢"); // String
            writer.flush();
        }
        Reader reader = new FileReader(fileName);

        // BufferedReader: 문자들을 buffer에 넣어두고 한번에 읽어들임
        BufferedReader br = new BufferedReader(reader);

        try (br; reader) {
            int r1 = br.read();
            System.out.println("(char) r1 = " + (char) r1);
            String r2 = br.readLine();
            System.out.println("r2 = " + r2);
        }
    }
}
