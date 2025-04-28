package ch02.lecture;

public class C11String {
    public static void main(String[] args) {
        String a;
        a = "javascript는 java랑 다르다";
        System.out.println("a = " + a);

        a = "동해물과 백두산이\n"
                + "마르고 닳도록\n"
                + "하느님이 보우하사\n"
                + "우리나라 만세\n";
        System.out.println("a = " + a);

        // String block : 여러 줄을 작성할 때 유용
        // """{TEXT}"""
        // 가장 왼쪽라인의 들여쓰기 기준으로 라인 맞추어 출력
        // 첫줄은 """ 다음 줄에 작성

        a = """
                    동해물과 백두산이
                    마르고 닳도록
                    하느님이 보우하사
                    우리나라 만세
                """;
        System.out.println("a = " + a);
    }
}
