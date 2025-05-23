package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App13 {
    public static void main(String[] args) {

        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void method1() throws FileNotFoundException {
        // FileNotFoundException(checked exception)
        // 1. try-catch로 감싸거나
        // 2. method에 명시 하거나

        FileInputStream fio = new FileInputStream("");
    }
}
