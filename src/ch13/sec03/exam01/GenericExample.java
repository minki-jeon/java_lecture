package ch13.sec03.exam01;

public class GenericExample {
    //* Reference : [Book. 이것이 자바다] p.582

    // Generic Method
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {

        // Call Generic Method
        Box<Integer> box1 = boxing(100);    // T -> Integer
        int intValue = box1.get();
        System.out.println(intValue);

        // Call Generic Method
        Box<String> box2 = boxing("홍길동");   // T -> String
        String strValue = box2.get();
        System.out.println(strValue);

    }
}
