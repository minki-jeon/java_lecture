package ch05.exercise;

import java.util.Arrays;

public class Exercise07 {
    //* Reference : [Book. 이것이 자바다] p.201
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        int max = 0;
        for (int n : array) {
            if (n > max) max = n;
        }
        System.out.println("max = " + max);


        // sort
        System.out.println("sort ------");
        Arrays.sort(array);
        System.out.println("array[array.length - 1] = " + array[array.length - 1]);
    }

}
