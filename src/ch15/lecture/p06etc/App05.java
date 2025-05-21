package ch15.lecture.p06etc;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class App05 {
    public static void main(String[] args) {
        // natural ordering이 결정안된 객체는 TreeSet 생성 시 Comparator로 순서 결정 가능
//        Set<Book05> set = new TreeSet<>((a, b) -> a.getPrice() - b.getPrice());
        Set<Book05> set = new TreeSet<>((a, b) -> a.getTitle().compareTo(b.getTitle()));
//        Set<Book05> set = new TreeSet<>();
        set.add(new Book05("java", 3000));
        set.add(new Book05("git", 4000));
        set.add(new Book05("spring", 2000));

        set.forEach(System.out::println);
    }
}

class Book05 {
    private String title;
    private Integer price;

    // 생성자, toString, equals, hashCode, getter, setter
    public Book05(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book05{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        Book05 book05 = (Book05) object;
        return Objects.equals(title, book05.title) && Objects.equals(price, book05.price);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(price);
        return result;
    }
}


