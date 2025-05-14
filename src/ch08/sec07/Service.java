package ch08.sec07;

public interface Service {
    //* Reference : [Book. 이것이 자바다] p.362
    // 디폴트 메소드
    default void defaultMethod1() {
        System.out.println("defaultMethod1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2 종속 코드");
    }

    // private method
    private void defaultCommon() {
        System.out.println("defaultMethod 중복 코드 A");
        System.out.println("defaultMethod 중복 코드 B");
    }

    // static method
    static void staticMethod1() {
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }
    
    static void staticMethod2() {
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("staticMethod 중복 코드 C");
        System.out.println("staticMethod 중복 코드 D");
    }
}
