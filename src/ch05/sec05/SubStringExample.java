package ch05.sec05;

public class SubStringExample {
    //* Reference : [Book. 이것이 자바다] p.163
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String fristNum = ssn.substring(0, 6);
        System.out.println(fristNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
