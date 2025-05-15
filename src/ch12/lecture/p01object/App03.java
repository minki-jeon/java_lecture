package ch12.lecture.p01object;

public class App03 {
    public static void main(String[] args) {
        Book03 a = new Book03();
        Book03 b = new Book03();
        a.setTitle("이것이 자바다");
        b.setTitle("이것이 자바다");

        // 참조값 비교
        System.out.println(a == b);   // false

        // equals(Object): 내용이 같은지 비교
        System.out.println(a.equals(b));      // false
    }
}

class Book03 {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // 필요하면 equals 메소드 재정의 한다. (형변환 이후, getTitle 비교)
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book03) {
            Book03 o = (Book03) obj;
            return this.title.equals(o.getTitle());
        }
        return false;
    }
}
