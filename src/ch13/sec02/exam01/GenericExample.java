package ch13.sec02.exam01;

public class GenericExample {
    //* Reference : [Book. 이것이 자바다] p.576
    public static void main(String[] args) {
        // K 타입은 Tv로 대체, M 타입은 String으로 대체
        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();
        // ---------------------------------------------------
        // K 타입은 Car로 대체, M 타입은 String으로 대체
        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
