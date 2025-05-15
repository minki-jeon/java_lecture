package ch12.lecture.p01object;

public class App08 {
    public static void main(String[] args) {
        Book08 b1 = new Book08("java", 5000);
        Book08 b2 = new Book08("git", 7000);

        System.out.println("제목: " + b1.getTitle() + ", " + "가격: " + b1.getPrice());
        System.out.println("제목: " + b2.getTitle() + ", " + "가격: " + b2.getPrice());

        System.out.println();

        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}

class Book08 {
    private String title;
    private int price;

    // Constructor 자동완성
    public Book08(String title, int price) {
        this.title = title;
        this.price = price;
    }

    // Getter 자동완성
    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    // toString() : 이 객체를 설명하는 텍스트 리턴

    @Override
    public String toString() {
        String text = "제목: " + title + ", " + "가격: " + price;
        return text;
    }
}
