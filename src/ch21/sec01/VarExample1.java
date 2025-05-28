package ch21.sec01;

public class VarExample1 {
    //* Reference : [Book. 이것이 자바다] p.982
    public static void main(String[] args) {
        String name = getData();
        var userName = getData();
    }

    public static String getData() {
        return "홍길동";
    }
}
