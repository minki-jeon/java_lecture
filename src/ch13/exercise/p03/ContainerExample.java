package ch13.exercise.p03;

public class ContainerExample {
    //* Reference : [Book. 이것이 자바다] p.589

    public static void main(String[] args) {
        Container<String, String> container1 = new Container<String, String>();
        container1.set("홍길동", "도적");
        String name1 = container1.getKey();
        String job = container1.getValue();

        System.out.println("name1 = " + name1);
        System.out.println("job = " + job);

        Container<String, Integer> container2 = new Container<String, Integer>();
        container2.set("홍길동", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();

        System.out.println("name2 = " + name2);
        System.out.println("age = " + age);
    }
}
