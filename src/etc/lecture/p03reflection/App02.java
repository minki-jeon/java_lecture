package etc.lecture.p03reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App02 {
    public static void main(String[] args) {
        Class<Book> c = Book.class;
        Field[] fields = c.getDeclaredFields();     // 클래스 필드 정보
        Constructor<?>[] constructors = c.getDeclaredConstructors();    // 클래스 생성자 정보
        Method[] methods = c.getDeclaredMethods();  // 클래스 메소드 정보

        System.out.println("fields = " + fields.length);    // 2
        System.out.println("constructors = " + constructors.length);    //2
        System.out.println("methods = " + methods.length);  // 5

    }
}

class Book {
    private String title;
    private Integer price;

    public Book() {

    }

    public Book(String title, Integer price) {
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
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
