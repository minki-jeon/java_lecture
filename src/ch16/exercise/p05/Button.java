package ch16.exercise.p05;

public class Button {
    //* Reference : [Book. 이것이 자바다] p.718

    // 정적 멤버 인터페이스 (함수형 인터페이스)
    @FunctionalInterface
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
