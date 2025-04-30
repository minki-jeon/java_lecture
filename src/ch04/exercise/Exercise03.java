package ch04.exercise;

public class Exercise03 {
    //* Reference : [Book. 이것이 자바다] p.140
    public static void main(String[] args) {
        // for 대신 while + if 사용
        int i = 1;
        int sum = 0;
        while (i <= 100) {
//            if (i % 3 == 0) sum += i;
            sum += (i % 3 == 0) ? i : 0;
            i++;
        }
        System.out.println("sum = " + sum); // 1683

        int sum2 = 0;
        for (int j = 1; j <= 100; j++) {
            sum2 += (j % 3 == 0) ? j : 0;
        }
        System.out.println("sum2 = " + sum2);

        int k = 0;
        int sum3 = 0;
        while (k <= 100) {
            sum3 += k;
            k += 3;
        }
        System.out.println("sum3 = " + sum3);
    }
}
