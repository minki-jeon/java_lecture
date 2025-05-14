package ch09.sec06.exam03;

public class Button {
    //* Reference : [Book. 이것이 자바다] p.413

    // 정적 멤버 인터페이스 (중첩 인터페이스)
    public static interface ClickListener {
        // 추상 메소드
        void onClick();
    }

    // field
    private ClickListener clickListener;

    // method
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        // Button이 클릭되었을 때 실행되는 method 선언
        this.clickListener.onClick();
    }
}
