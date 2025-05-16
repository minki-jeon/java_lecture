package ch13.sec05;

public class Course {
    //* Reference : [Book. 이것이 자바다] p.586
    // 모든 사람이면 등록 가능
    public static void registerCourse1(Applicant<?> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");

        Object kind = applicant.getKind();
        kind.toString();
//        applicant.setKind(new Object());
    }

    // 학생만 등록 가능
    public static void registerCourse2(Applicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");

        // producer extends (pecs)
        Student kind = applicant.getKind();

    }

    // 직장인 및 일반인만 등록 가능
    public static void registerCourse3(Applicant<? super Worker> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");

        // consumer super (pecs)
        applicant.setKind(new Worker());
    }

}
