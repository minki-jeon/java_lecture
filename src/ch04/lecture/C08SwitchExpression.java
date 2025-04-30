package ch04.lecture;

public class C08SwitchExpression {
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("실행코드 1");
                System.out.println("실행코드 2");
                break;
            case 2:
                System.out.println("실행코드 3");
                System.out.println("실행코드 4");
                break;
            default:
                System.out.println("실행코드 5");
                System.out.println("실행코드 6");
        }

        // switch expression : break; 키워드 대신 코드블럭을 추가하여 사용
        switch (a) {
            case 1 -> {
                System.out.println("실행코드 1");
                System.out.println("실행코드 2");
            }
            case 2 -> {
                System.out.println("실행코드 3");
                System.out.println("실행코드 4");
            }
            default -> {
                System.out.println("실행코드 5");
                System.out.println("실행코드 6");
            }
        }

        // old style
        switch (a) {
            case 1:
            case 2:
                System.out.println("실행코드 7");
            case 3:
            case 4:
                System.out.println("실행코드 8");
            default:
                System.out.println("실행코드 9");
        }

        // new style
        switch (a) {
            case 1, 2 -> {
                System.out.println("실행코드 7");
            }
            case 3, 4 -> {
                System.out.println("실행코드 8");
            }
            default -> {
                System.out.println("실행코드 9");
            }
        }

        // new style, 코드 블럭이 한 줄이면 {} 생략 가능
        switch (a) {
            case 1, 2 -> System.out.println("실행코드 7");
            case 3, 4 -> System.out.println("실행코드 8");
            default -> System.out.println("실행코드 9");
        }

    }
}
