package ch08.lecture.p04api;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        //Object
        // Closeable
        // AutoCloseable
        // Iterator
        Object o = s;
        Closeable c = s;
        AutoCloseable a = s;
        Iterator i = s;

        System.out.println(c instanceof Scanner);
        System.out.println(c instanceof Object);
        System.out.println(c instanceof Closeable);
        System.out.println(c instanceof AutoCloseable);
        System.out.println(c instanceof Iterator);

        c.close();
//        c.nextLine();
        Scanner c1 = (Scanner) c;
        c1.nextLine();
    }
}
