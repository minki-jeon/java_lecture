package etc.lecture.p04annotation;

public class App01 {
    public static void main(String[] args) {

    }
}

// annotation
@FunctionalInterface
interface MyInterface {
    void method();
}

class Book {
    // annotation
    @Override
    public String toString() {
        return super.toString();
    }
}

// annotation: 코드의 부가 정보
//  - 어디선가 이 부가 정보를 확인하여 어떤 행동을 취하라고 알려줌
