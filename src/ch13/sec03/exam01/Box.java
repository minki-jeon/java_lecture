package ch13.sec03.exam01;

public class Box<T> {
    //* Reference : [Book. 이것이 자바다] p.581

    private T t;

    // Getter 메소드
    public T get() {
        return t;
    }

    // Setter 메소드
    public void set(T t) {
        this.t = t;
    }
}
