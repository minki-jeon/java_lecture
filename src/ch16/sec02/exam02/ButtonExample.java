package ch16.sec02.exam02;

public class ButtonExample {
    //* Reference : [Book. 이것이 자바다] p.702
    public static void main(String[] args) {
        //Ok 버튼 객체 생성
        Button btnOk = new Button();

        //Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        // 매개 값으로 람다식 대입
        btnOk.setClickListener(() -> {
            System.out.println("Ok 버튼을 클릭했습니다.");
        });

        // Ok 버튼 클릭
        btnOk.click();

        // cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        btnCancel.setClickListener(() -> {
            System.out.println("Cancel 버튼을 클릭했습니다.");
        });

        // Cancel 버튼 클릭
        btnCancel.click();
    }
}
