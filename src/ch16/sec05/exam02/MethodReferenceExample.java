package ch16.sec05.exam02;

public class MethodReferenceExample {
    //* Reference : [Book. 이것이 자바다] p.713
    public static void main(String[] args) {
        Person person = new Person();
//        person.ordering((s, str) -> s.compareToIgnoreCase(str));
        person.ordering(String::compareToIgnoreCase);
    }
}
