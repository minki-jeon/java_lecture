package ch06.lecture.p06static;

public class App04 {
    public static void main(String[] args) {
        // main method: Application 시작 시 처음 실행되는 정적(static) 메소드

        System.out.println("코드 시작");

        // args (arguments) 추가: [Modify Run Configuration] > [Program arguments]에 추가
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[i] = " + args[i]);
        }

        if (args.length > 0) {
            String mode = args[0];
            switch (mode) {
                case "dev" -> System.out.println("개발용 코드 실행");
                case "prod" -> System.out.println("운영용 코드 실행");
                case "test" -> System.out.println("테스트용 코드 실행");
                default -> System.out.println("옵션을 넣어주세요.");
            }
        }
    }
}
