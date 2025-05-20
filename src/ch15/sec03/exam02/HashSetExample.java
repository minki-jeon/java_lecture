package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    //* Reference : [Book. 이것이 자바다] p.655
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println("총 객체 수: " + set.size());
    }
}
