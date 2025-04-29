package ch03.exercise;

public class Exercise03 {
    //* Reference : [Book. 이것이 자바다] p.109
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        // 학생 한 명이 가지는 연필 수
        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent);              // 534 / 30 = 17

        // 남은 연필 수
        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft);                    // 534 % 30 = 24
    }
}
