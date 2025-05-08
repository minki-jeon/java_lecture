package ch06.lecture.p05constructor;

public class App04 {
}

class MyClass42 {
    String name;
    String nickName;
    int age;
    boolean done;
    double score;

    // 생성자 자동생성 : (마우스 우클릭 -> Generate) 또는 [Alt+Insert] -> Constructor
    public MyClass42(String name, String nickName, int age, boolean done, double score) {
        this.name = name;
        this.nickName = nickName;
        this.age = age;
        this.done = done;
        this.score = score;
    }
}

class MyClass41 {
    String name;
    String address;
    int age;
    boolean married;

    MyClass41(String name, String address, int age, boolean married) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.married = married;
    }

}
