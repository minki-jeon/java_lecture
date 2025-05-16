package ch13.exercise.p02;

public class Container<T> {
    //* Reference : [Book. 이것이 자바다] p.589
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
