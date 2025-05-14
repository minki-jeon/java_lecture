package ch16.sec01;

@FunctionalInterface
public interface Calculable {
    //* Reference : [Book. 이것이 자바다] p.699
    // 추상메소드 하나
    void calculate(int x, int y);

    // @formatter:off
    int max = 0;
    static void method() {}
    private static void method1() {}
    default void method2() {}
    private void method3() {}

}
