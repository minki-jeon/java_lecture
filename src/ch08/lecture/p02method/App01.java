package ch08.lecture.p02method;

public class App01 {
    public static void main(String[] args) {
        // interface의 인스턴스 생성 불가
//        Beast1 a = new Beast1();
        Tiger1 t = new Tiger1();
        Wolf1 w = new Wolf1();

        Beast1 b = t;
        Beast1 c = w;
        b.hunt();   // Tiger.hunt();
        c.hunt();   // Wolf.hunt();
    }

}

interface Beast1 {
    // interface의 메소드는 public abstract method
    // abstract method
    public abstract void hunt();
}

class Tiger1 implements Beast1 {
    @Override
    public void hunt() {
        System.out.println("초식동물을 사냥합니다.");
    }
}

class Wolf1 implements Beast1 {
    @Override
    public void hunt() {
        System.out.println("육식동물을 사냥합니다.");
    }
}


