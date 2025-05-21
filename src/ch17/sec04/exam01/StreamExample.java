package ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    //* Reference : [Book. 이것이 자바다] p.733
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Product product = new Product(i, "상품" + i, "멋진 회사 ", (int) (10000 * Math.random()));
            list.add(product);
        }

        list.stream().forEach(p -> System.out.println(p));
    }
}
