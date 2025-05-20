package ch15.lecture.p04stack;

import java.util.Stack;

public class App01 {
    public static void main(String[] args) {
        // Stack(LIFO; Last In First Out) : 마지막에 들어간 객체가 먼저 나온다.

        Stack<String> stack = new Stack<>();

        // 추가 push
        stack.push("java");
        stack.push("spring");
        stack.push("react");
        stack.push("java");
        stack.push("css");
        System.out.println(stack);

        // 꺼내기 pop
        String e1 = stack.pop();
        System.out.println("e1 = " + e1);
        String e2 = stack.pop();
        System.out.println("e2 = " + e2);
        System.out.println(stack);

        // 가장 위에 있는 객체 확인 peek
        String e3 = stack.peek();
        System.out.println("e3 = " + e3);

        
    }
}
