package ch06.sec10.exam02;

public class Television {
    //* Reference : [Book. 이것이 자바다] p.251
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }
}
