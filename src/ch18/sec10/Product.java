package ch18.sec10;

import java.io.Serializable;

public class Product implements Serializable {
    //* Reference : [Book. 이것이 자바다] p.813
    private static final long serialVersionUID = -621812868470078544L;
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": " + price;
    }
}
