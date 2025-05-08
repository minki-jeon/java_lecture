package ch06.exercise.p15;

public class MemberService {
    //* Reference : [Book. 이것이 자바다] p.281

    boolean login(String id, String password) {
//        if ("hong".equals(id) && "12345".equals(password)) {
//            return true;
//        }
//        return false;
        return "hong".equals(id) && "12345".equals(password);
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다");
    }
}
