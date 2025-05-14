package ch16.exercise.p07;

@FunctionalInterface
public interface Operator {
    //* Reference : [Book. 이것이 자바다] p.719
    public int apply(int x, int y);
}
