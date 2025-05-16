package ch13.exercise.p02;

public class ContainerExample {
    //* Reference : [Book. 이것이 자바다] p.589
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();
        System.out.println("str = " + str);

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.get();
        System.out.println("value = " + value);
    }
}
