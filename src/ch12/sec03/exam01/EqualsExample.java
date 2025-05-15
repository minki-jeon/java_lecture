package ch12.sec03.exam01;

public class EqualsExample {
    //* Reference : [Book. 이것이 자바다] p.501
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        //  재정의한 메소드에 따라, 매개값이 Member 타입이고 id도 동일하므로 true
        if (obj1.equals(obj2)) {
            System.out.println("obj1과 obj2는 동등합니다.");
        } else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }

        // 매개값이 Member 타입이지만, id가 다르므로 false
        if (obj1.equals(obj3)) {
            System.out.println("obj1과 obj3는 동등합니다.");
        } else {
            System.out.println("obj1과 obj3는 동등하지 않습니다.");
        }


    }
}
