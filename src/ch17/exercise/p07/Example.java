package ch17.exercise.p07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    //* Reference : [Book. 이것이 자바다] p.775
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        List<Member> developers = list.stream()
                .filter(s -> s.getJob().equals("개발자"))
                .toList();
        developers
                .stream()
                .forEach(m -> System.out.println(m.getName()));

        System.out.println();
        // for
        List<Member> developrs1 = new ArrayList<>();
        for (Member m : list) {
            if (m.getJob().equals("개발자")) {
                developrs1.add(m);
            }
        }
        for (Member m : developrs1) {
            System.out.println(m.getName());
        }

    }
}
