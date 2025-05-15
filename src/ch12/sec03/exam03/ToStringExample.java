package ch12.sec03.exam03;

public class ToStringExample {
    //* Reference : [Book. 이것이 자바다] p.506
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);     // toString() 호출

        System.out.println(myPhone);    // toString() 호출
    }
}
