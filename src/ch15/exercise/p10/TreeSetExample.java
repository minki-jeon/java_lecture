package ch15.exercise.p10;

import java.util.TreeSet;

public class TreeSetExample {
    //* Reference : [Book. 이것이 자바다] p.693
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>();
        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("hong", 86));
        treeSet.add(new Student("white", 92));
        treeSet.add(new Student("red", 96));

        System.out.println(treeSet.size());

        Student student = treeSet.last();
        System.out.println("최고 점수: " + student.score);
        System.out.println("최고 점수를 받은 아이디: " + student.id);
    }
}
