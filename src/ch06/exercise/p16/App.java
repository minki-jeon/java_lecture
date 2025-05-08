package ch06.exercise.p16;

public class App {
    //* Reference : [Book. 이것이 자바다] p.281
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}
