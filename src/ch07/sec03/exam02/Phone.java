package ch07.sec03.exam02;

public class Phone {
    //* Reference : [Book. 이것이 자바다] p.293
    private String model;
    private String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행");
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
