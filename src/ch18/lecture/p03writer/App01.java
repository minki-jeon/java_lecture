package ch18.lecture.p03writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("D:\\01.private_work\\Choongang\\workspaces\\Temp\\writer01.txt");
        os.write(97);       // (ASCII) a
        os.write(100);      // (ASCII) d
        os.write(103);      // (ASCII) g
        os.write(63);       // (ASCII) !
        os.write('t');      // t (1byte)
        os.write('걸');      // (Unicode 78) x
        // ASCII 1byte, Unicode는 2byte로 구성


        os.flush();
    }
}
