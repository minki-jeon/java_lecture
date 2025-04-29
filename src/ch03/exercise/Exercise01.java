package ch03.exercise;

public class Exercise01 {
    //* Reference : [Book. 이것이 자바다] p.109
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
}
