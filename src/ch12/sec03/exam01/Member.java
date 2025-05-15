package ch12.sec03.exam01;

public class Member {
    //* Reference : [Book. 이것이 자바다] p.500
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        // Object의 equals()를 재정의(Override)
        if (obj instanceof Member target) {
            // 형(타입)변환
            if (id.equals(target.id)) {
                // id 문자열 비교
                return true;
            }
        }
        return false;
    }
}
