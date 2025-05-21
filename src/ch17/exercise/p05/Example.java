package ch17.exercise.p05;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Example {
    //* Reference : [Book. 이것이 자바다] p.773
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream()
                .filter(n -> n.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }

}
