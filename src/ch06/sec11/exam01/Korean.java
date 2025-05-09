package ch06.sec11.exam01;

public class Korean {
    //* Reference : [Book. 이것이 자바다] p.255
    // 인스턴스 final 필드
    final String nation = "대한민국";
    final String ssn;

    // 인스턴스 필드
    String name;

    // 생성자
    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
