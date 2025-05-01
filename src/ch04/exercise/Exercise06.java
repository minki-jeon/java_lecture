package ch04.exercise;

public class Exercise06 {
    //* Reference : [Book. 이것이 자바다] p.141
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------------------");
        String s = "*";
        for (int i = 0; i < 5; i++, s += "*") {
            System.out.println(s);
        }

        System.out.println("------------------------------");
        int j = 0;
        for (int i = 1; i < 6; i++) {
            System.out.print("*");
            if ((i > j) && (i < 5)) {
                i = 0;
                j++;
                System.out.println();
            }
        }
    }
}
