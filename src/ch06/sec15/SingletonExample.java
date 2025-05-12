package ch06.sec15;

public class SingletonExample {
    //* Reference : [Book. 이것이 자바다] p.276ㅔ
    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
         */

        //정적 메소드 호출해서 싱글톤 객체 얻음
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        //동일한 객체를 참조하는지 확인
        if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
