package ch12.exercise.p06;

public class MemberExample {
    //* Reference : [Book. 이것이 자바다] p.565
    public static void main(String[] args) {
        Member member = new Member("blue", "이파란");
        Member member1 = new Member("red", "trump");
        System.out.println(member);
        System.out.println(member1);
    }
}
