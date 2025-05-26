package ch18.lecture.p03writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App03 {
    public static void main(String[] args) throws IOException {
        try (Writer writer = new FileWriter("D:\\01.private_work\\Choongang\\workspaces\\Temp\\writer03.txt")) {
            writer.write('a');
            writer.write('한');
            writer.write('\u2669');     // [imoji] 음표기호
//            writer.write('\u1f9e2');      // (Char)2byte가 넘어가서 사용 불가
            writer.write("🧢");        // (String) [imoji] 야구모자

            writer.flush();
        }
    }
}
