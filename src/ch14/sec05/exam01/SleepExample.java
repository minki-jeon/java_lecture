package ch14.sec05.exam01;

import java.awt.*;

public class SleepExample {
    //* Reference : [Book. 이것이 자바다] p.606
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
