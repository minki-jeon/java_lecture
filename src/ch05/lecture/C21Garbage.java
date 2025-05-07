package ch05.lecture;

import java.util.Arrays;

public class C21Garbage {
    public static void main(String[] args) {
        int[] a = new int[]{5, 6};
        int[] b = new int[]{10, 20};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        b = new int[]{100, 200};        // b{10, 20}에 대한 참조를 잃어서 배열값 Garbage
        System.out.println(Arrays.toString(b));
    }
}
