package ch16.sec05.exam02;

@FunctionalInterface
public interface Comparable {
    //* Reference : [Book. 이것이 자바다] p.712
    int compare(String a, String b);
}
