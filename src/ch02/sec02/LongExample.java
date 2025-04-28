package ch02.sec02;

public class LongExample {
    //* Reference : [Book. 이것이 자바다] p.45
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
//        long var3 = 1000000000000;      // 컴파일러는 int로 간주하기 때문에 Error 발생
        long var4 = 1000000000000L;
        // underscore(underbar)로 자릿수 표시 가능
        long var5 = 1_000_000_000_000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
