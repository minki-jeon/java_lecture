package ch06.lecture.p11etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import static java.lang.Math.PI;             
//import static java.lang.Math.random;        // Math.random() 을 random()으로 사용
import static java.lang.Math.*;

public class C01ImportStatic {
    public static void main(String[] args) {
        // 다른 패키지에 있는 클래스 사용할 때 import
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        // import static
        random();
        double v = PI * 10;


    }
}
