package ch02.lecture;

public class C16String {
    public static void main(String[] args) {
        // 기본타입 <-> String 사이에 형변환 불가
        int a = 300;
//        String b = a;

        String c = "300";
//        int d = c;


        // 기본타입 -> String
        // String.valueOf() 사용
        int e = 700;
        String f = String.valueOf(e);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        double g = 3.14;
        String h = String.valueOf(g);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // String 연결연산자(+) 사용
        int i = 900;
        String j = i + "";
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // String -> 기본타입
        // Parsing: {타입명}.parse{타입명}({문자열})
        String k = "333";
        String l = "123.456";
        String m = "true";
        int n = Integer.parseInt(k);
        double o = Double.parseDouble(l);
        boolean p = Boolean.parseBoolean(m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        System.out.println("p = " + p);

        // 파싱 불가 - 변환할 타입에 맞지않는 값인 경우
        String q = "123.456qwer";
//        double r = Double.parseDouble(q);
//        System.out.println("r = " + r);


    }
}
