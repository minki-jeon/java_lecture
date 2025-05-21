package ch15.sec05.exam03;

public class Person implements Comparable<Person> {
    //* Reference : [Book. 이것이 자바다] p.675
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (age < o.age) return -1;
        else if (age == o.age) return 0;
        else return 1;
    }
}
