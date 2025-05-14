package ch16.sec03;

@FunctionalInterface
public interface Workable {
    //* Reference : [Book. 이것이 자바다] p.704
    void work(String name, String job);
}
