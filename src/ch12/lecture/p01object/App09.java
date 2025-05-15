package ch12.lecture.p01object;

public class App09 {
    public static void main(String[] args) {
        Car09 c1 = new Car09("tesla", 7000);
        Car09 c2 = new Car09("genesis", 9000);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        // println 에서 toString() 재정의되어있으므로 toString() 생략.
        System.out.println(c1);
        System.out.println(c2);
    }
}

class Car09 {
    private String model;
    private int price;

    // 생성자 자동완성
    public Car09(String model, int price) {
        this.model = model;
        this.price = price;
    }

    // toString 자동완성
    @Override
    public String toString() {
        return "Car09{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
