package ch16.sec05.exam03;

@FunctionalInterface
public interface Creatable1 {
    //* Reference : [Book. 이것이 자바다] p.714
    public Member create(String id);
}
