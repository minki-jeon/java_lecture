package ch11.sec05;

public class ThrowsExample2 {
    //* Reference : [Book. 이것이 자바다] p.481
    public static void main(String[] args) throws Exception {
        findClass();
    }

    private static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
