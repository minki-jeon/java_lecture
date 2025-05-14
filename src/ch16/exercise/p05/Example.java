package ch16.exercise.p05;

public class Example {
    //* Reference : [Book. 이것이 자바다] p.718
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("Ok 버튼을 클릭했습니다."));
//        btnOk.setClickListener(new Button.ClickListener() {
//            @Override
//            public void onClick() {
//                System.out.println("Ok 버튼을 클릭했습니다.");
//            }
//        });
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));
//        btnCancel.setClickListener(new Button.ClickListener() {
//            @Override
//            public void onClick() {
//                System.out.println("Cancel 버튼을 클릭했습니다.");
//            }
//        });
        btnCancel.click();
    }
}
