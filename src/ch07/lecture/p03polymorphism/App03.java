package ch07.lecture.p03polymorphism;

public class App03 {
    public static void main(String[] args) {
        Dog01 a = new Dog01();
        BullDog01 b = new BullDog01();
        Chihuahua01 c = new Chihuahua01();

        a.bark();   // 멍멍
        b.bark();   // 으르렁
        c.bark();   // 깨갱

        Dog01 d = b;
        d.bark();   // 으르렁 (BullDog01 b)
        Dog01 e = c;
        e.bark();   // 깨갱
    }
}

class Dog01 {
    public void bark() {
        System.out.println("멍멍");
    }
}

class BullDog01 extends Dog01 {
    public void bark() {
        System.out.println("으르렁");
    }
}

class Chihuahua01 extends Dog01 {
    public void bark() {
        System.out.println("깨갱");
    }
}


