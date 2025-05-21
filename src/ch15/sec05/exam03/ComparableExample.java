package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    //* Reference : [Book. 이것이 자바다] p.675
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("김자바", 25));
        treeSet.add(new Person("박지원", 31));

        for (Person person : treeSet) {
            System.out.println(person.name + ":" + person.age);
        }
    }
}
