package ch12.sec06;

public class ValueCompareExample {
    //* Reference : [Book. 이것이 자바다] p.530
    public static void main(String[] args) {
        // -128~127 초과값일 경우
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==: " + (obj1 == obj2));            // false
        System.out.println("equals(): " + obj1.equals(obj2));   // true
        System.out.println();

        int a = obj1;
        int b = obj2;
        System.out.println(a == b);     // true
        System.out.println();

        // -128~127 범위값일 경우
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==: " + (obj3 == obj4));        // true
        System.out.println("equals(): " + obj3.equals(obj4));   // true

    }
}
