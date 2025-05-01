package ch04.lecture;

public class C25CodeBlock {
    public static void main(String[] args) {
        if (true) {
            // 코드 블럭 {} 오른쪽 들여쓰기할 것
        } else if (true)
            // 코드 블럭 내의 코드가 한 줄 이면 {} 생략 가능. 하지만 가급적 생략하지 말 것
            System.out.println();
        else
            System.out.println();
        System.out.println();

        for (int i = 0; i < 3; i++) {

        }
        while (true) {
            break;
        }

        for (int i = 0; i < 3; i++)
            System.out.println("hi");
        boolean a = true;
        while (a) System.out.println("hello");
    }
}
