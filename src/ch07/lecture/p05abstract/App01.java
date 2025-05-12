package ch07.lecture.p05abstract;

public class App01 {
    public static void main(String[] args) {
        Chihuahua01 a = new Chihuahua01();
        Wolf01 b = new Wolf01();
        // 추상(abstract) 클래스는 instance 생성 불가
//        Canids c = new Canids();

        // 타입변환은 가능
        Canids01 d = a;
        Canids01 e = b;

        Canids01 f = new Chihuahua01();
        Canids01 g = new Wolf01();
    }
}

// 개과 동물
abstract class Canids01 {
}

class Chihuahua01 extends Canids01 {
}

class Wolf01 extends Canids01 {
}