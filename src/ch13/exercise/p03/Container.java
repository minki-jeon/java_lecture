package ch13.exercise.p03;

public class Container<String, T> {
    //* Reference : [Book. 이것이 자바다] p.589

    private String key;
    private T value;


    public void set(String key, T value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

}
