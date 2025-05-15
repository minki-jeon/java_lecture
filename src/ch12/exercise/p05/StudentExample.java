package ch12.exercise.p05;

import java.util.HashSet;

public class StudentExample {
    //* Reference : [Book. 이것이 자바다] p.564
    public static void main(String[] args) {
        // Student를 저장하는 HashSet 생성
        HashSet<Student> hashSet = new HashSet<Student>();

        // Student 저장
        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));  // 중복 저장 안됨 (hashCode 재정의 후)
        hashSet.add(new Student("2"));

        // 저장된 Student 수 출력
        System.out.println("저장된 Student 수: " + hashSet.size());
    }
}
