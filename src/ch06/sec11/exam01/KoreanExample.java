package ch06.sec11.exam01;

public class KoreanExample {
    //* Reference : [Book. 이것이 자바다] p.282
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567", "김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // final 필드는 값 변경 불가
//        k1.nation = "USA";
//        k1.ssn = "123-12-1234";

        k1.name = "고자바";
        System.out.println("k1.name = " + k1.name);

        Korean k2 = new Korean("343434-5656565", "hong");
        System.out.println("k2.ssn = " + k2.ssn);
    }

}
