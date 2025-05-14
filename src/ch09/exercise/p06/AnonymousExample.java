package ch09.exercise.p06;

public class AnonymousExample {
    //* Reference : [Book. 이것이 자바다] p.426
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.run();
        anony.method1();
        anony.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다.");
            }
        });
    }
}
