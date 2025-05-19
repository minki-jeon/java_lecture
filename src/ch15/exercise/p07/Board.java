package ch15.exercise.p07;

public class Board {
    //* Reference : [Book. 이것이 자바다] p.690
    private String title;
    private String content;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
