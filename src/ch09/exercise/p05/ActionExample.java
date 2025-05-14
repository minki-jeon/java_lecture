package ch09.exercise.p05;

public class ActionExample {
    //* Reference : [Book. 이것이 자바다] p.425
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("복사를 합니다.");
            }
        };
        // Action action = () -> System.out.println("복사를 합니다.");
        
        action.work();
    }
}
