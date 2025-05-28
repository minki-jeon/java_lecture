package ch12.sec11.exam02;

public class Car {
    //* Reference : [Book. 이것이 자바다] p.552
    // field
    private String model;
    private String owner;

    // Constructor
    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    // Methods
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
